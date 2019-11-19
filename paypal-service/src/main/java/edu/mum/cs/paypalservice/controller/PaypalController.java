package edu.mum.cs.paypalservice.controller;

import edu.mum.cs.paypalservice.model.Booking;
import edu.mum.cs.paypalservice.model.Paypal;
import edu.mum.cs.paypalservice.repository.PaypalRepository;
import edu.mum.cs.paypalservice.util.PayPalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
public class PaypalController {
    @Autowired
    private PaypalRepository paypalRepository;

    @Autowired
    private PayPalClient payPalClient;

    @GetMapping("/home")
    public String index() {
        return "This is paypal service";
    }

    @GetMapping("/cancelPayment")
    public String cancelPayment() {
        return "cancelled payment";
    }

    @PostMapping(value = "/makePayment")
    public Map<String, Object> makePayment(@RequestBody Booking booking) {
        String price = booking.getPrice();
        String userId = booking.getUserId();
        String apartmentId = booking.getApartmentId();
        String bookingId = booking.getBookingId();
        return payPalClient.createPayment(bookingId, userId, apartmentId, price);
    }

    @PostMapping(value = "/completePayment")
    public Map<String, Object> completePayment(HttpServletRequest request) {
        String paymentId = request.getParameter("paymentId");
        String PayerID = request.getParameter("PayerID");
        return payPalClient.completePayment(paymentId, PayerID);
    }

    @PostMapping("/savePayment")
    public String savePayment(@RequestBody Paypal paypal){
        paypalRepository.save(paypal);
        return "Payment saved with id: "+paypal.getId();
    }
}
