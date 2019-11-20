package edu.mum.cs.paymentservice.feign;

import edu.mum.cs.paymentservice.model.Booking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URI;
import java.util.Map;

@FeignClient(name = "Payment", url = "http://example")
public interface PaymentFeign {
    @RequestMapping(method = RequestMethod.POST)
    Map<String, Object> makePayment(URI baseUrl, @RequestBody Booking booking);
}
