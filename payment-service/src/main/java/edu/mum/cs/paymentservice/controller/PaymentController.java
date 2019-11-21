package edu.mum.cs.paymentservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import edu.mum.cs.paymentservice.config.PaymentConfig;
import edu.mum.cs.paymentservice.feign.PaymentFeign;
import edu.mum.cs.paymentservice.model.Booking;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
@RefreshScope
public class PaymentController {
    @Autowired
    private PaymentFeign paymentFeign;
    @Autowired
    private PaymentConfig paymentConfig;

    @GetMapping("/payment/methods")
    @ApiOperation(value = "Gives the available payment methods.")
    public Set<String> paymentMethods() {
        return paymentConfig.getPaymentMethods().keySet();
    }

    @PostMapping(value = "/makePayment/{method}")
    @ApiOperation(value = "Makes a payment and gets redirect url from gateway")
    @HystrixCommand(fallbackMethod = "makePaymentFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000")
    })
    public Map<String, Object> makePayment(@ApiParam(value = "The name of payment method", required = true) @PathVariable String method, @RequestBody Booking booking) {
        String paymentServiceUrl = paymentConfig.getPaymentMethods().get(method);
        URI serviceUri = URI.create(paymentServiceUrl);
        return paymentFeign.makePayment(serviceUri, booking);
    }

    public Map<String, Object> makePaymentFallback(@PathVariable String method, @RequestBody Booking booking, Throwable throwable) {
        Map<String, Object> resp = new HashMap<>();
        resp.put("status", "failed");
        resp.put("message", "There is something error: "+throwable.getCause());
        return resp;
    }
}
