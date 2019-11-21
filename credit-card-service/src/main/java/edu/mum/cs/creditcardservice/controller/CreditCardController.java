package edu.mum.cs.creditcardservice.controller;

import edu.mum.cs.creditcardservice.model.Payment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CreditCardController {
    @PostMapping("/makePayment")
    public Map<String, String> makePayment(@RequestBody Payment payment) {
        Map<String, String> resp = new HashMap<>();
        resp.put("status", "success");
        resp.put("message", "Payment created. Amount is: " + payment.getPrice());
        return resp;
    }

    @PostMapping("/completePayment")
    public Map<String, String> completePayment(@RequestBody Map<String, Object> data) {
        Map<String, String> resp = new HashMap<>();
        resp.put("status", "success");
        resp.put("message", "Payment made with credit card.");
        resp.put("paymentId", "teakdfjs-45");
        return resp;
    }
}
