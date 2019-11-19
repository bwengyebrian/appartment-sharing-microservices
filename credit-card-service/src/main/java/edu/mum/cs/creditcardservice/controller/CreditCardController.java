package edu.mum.cs.creditcardservice.controller;

import edu.mum.cs.creditcardservice.model.Booking;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CreditCardController {
    @PostMapping("/makePayment")
    public Map<String, String> makePayment(@RequestBody Booking booking) {
        Map<String, String> resp = new HashMap<>();
        resp.put("status", "success");
        resp.put("message", "Payment made with credit card. Amount is: "+booking.getPrice());
        return resp;
    }
}
