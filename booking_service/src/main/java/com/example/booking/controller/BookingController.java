package com.example.booking.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.booking.model.Bookings;
import com.example.booking.service.BookingService;

@RestController
public class BookingController {
	
	

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder.build();
	}
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private BookingService bookingService;

	@PostMapping("/addbooking")
	public String add(@RequestBody Bookings booking, HttpServletRequest request) {

		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", request.getHeader("Authorization"));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/getusername", HttpMethod.GET,
				entity, String.class);
		
		booking.setUser_id(response.getBody());	
		
		int total=100;
		
		ResponseEntity<String> paymentResponse = restTemplate.exchange("http://localhost:8099/makepayment", HttpMethod.GET,
				entity, String.class);
		
		
		
		
		
		
		Bookings booked= bookingService.book(booking);
		
		
		// NOtify him
		
		//sendEmail(booking.getUser_id(),paymentResponse.getBody());
		
		
		return paymentResponse.getBody();
		
	}
	
	
	
	
	
	public void sendEmail(String email,String body) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("Room Booked / Payment Received");
		msg.setText(body+"\nRoom Booked...");
		//System.out.println("Sending...");
		javaMailSender.send(msg);
	//	System.out.println("Sent.");
		//return "Email Sent";
	}
	
	
	
	
	
	
	
	

	 @GetMapping("/payment")
	    public String payment(){
	       //return restTemplate.getForObject("http://localhost:8090/payments", String.class);
	        
	         return "null";
	        
	 }
	 
	 @GetMapping("/apartment")
	    public String apartment(){
		  //return restTemplate.getForObject("http://localhost:8090/apartments", String.class);
     
     return "null";
	 }
	
	
	
	@GetMapping("/allbookings")
	public List<Bookings> getAll() {
		return bookingService.getAllBookings();
	}

	@PostMapping("/deletebooking")
	public String delete(@RequestBody Bookings booking) {
		bookingService.remove(booking);
		return "Removed booking";
	}

}