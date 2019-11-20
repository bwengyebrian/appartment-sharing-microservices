//package com.example.booking.kafka;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//import com.example.booking.model.Bookings;
//import com.example.booking.service.BookingService;
//
//@Service
//public class Producer {
//
//	private Bookings booking;
//
//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;
//
//	
//	
//	@Autowired
//	private JavaMailSender javaMailSender;
//	
//	
//	@Autowired
//	private BookingService bookingService;
//	
//
//	public void sendMessage(Bookings booking, String jwt) {
//		this.booking = booking;
//		System.out.println("message sending " + jwt);
//
//		this.kafkaTemplate.send("username", jwt);
//	}
//
//	@KafkaListener(topics = "responseback", groupId = "group_id_1")
//	public void consume(String username) throws IOException {
//
//		this.booking.setUser_id(username);
//		
//		System.out.println("MESSAGE RECEIVED FROM JWT "+username);
//
//		this.kafkaTemplate.send("makepayment", "100");
//
//
//	}
//
//	@KafkaListener(topics = "responsebackpayment", groupId = "newGroup23")
//	public void consume2(String paymentResponse) throws IOException {
//		
//		if(paymentResponse.startsWith("P")) {
//
//		System.out.println(paymentResponse + " payment response erceived from " + booking.getUser_id());
//		bookingService.book(booking);
//		sendEmail(booking.getUser_id(),paymentResponse+"\nRoom Booked...");
//		}
//		
//		else
//			sendEmail(booking.getUser_id(),"Something went Wrong! Try Again");
//
//	}
//	public void sendEmail(String email,String body) {
//		SimpleMailMessage msg = new SimpleMailMessage();
//		msg.setTo(email);
//		msg.setSubject("Room Booked / Payment Received");
//		msg.setText(body);
//		//System.out.println("Sending...");
//		javaMailSender.send(msg);
//	//	System.out.println("Sent.");
//		//return "Email Sent";
//	}
//
//}
