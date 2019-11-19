//package com.example.demo.kafka;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//
//@Service
//public class Consumer {
//	@Autowired
//	private KafkaTemplate<String, String> kafkaTemplate;
//	
//	@Autowired
//	private RestTemplate restTemplate;
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
//		return restTemplateBuilder.build();
//	}
//
//	// private final Logger logger = LoggerFactory.getLogger(Producer.class);
//
//	@KafkaListener(topics = "makepayment", groupId = "group_id_i")
//	public void consume(String amount) throws IOException {
//		
//		System.out.println("MESSAGE = "+amount);
//		
//		String response = restTemplate.getForObject("http://localhost:8099/makepaymentnow",String.class);
//		
//		System.out.println("RESPONSE "+response);
//		
//		// logger.info(String.format("#### -> Consumed message -> %s", message));
//		//System.out.println("message received " + getUserEmail(jwt));
//		
//		if(response.startsWith("P"))
//		
//		 this.kafkaTemplate.send("responsebackpayment", "Payment Success of $"+amount);
//		else
//			this.kafkaTemplate.send("responsebackpayment",response);
//
//	}
//	
//	
//	
//	
//	
//}
