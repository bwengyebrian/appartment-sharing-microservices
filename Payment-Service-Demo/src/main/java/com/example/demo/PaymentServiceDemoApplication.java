
package com.example.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@SpringBootApplication
@RestController
@EnableHystrix
public class PaymentServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceDemoApplication.class, args);
	}
	
	@GetMapping("/makepayment")
	@HystrixCommand(fallbackMethod = "errorMessage", commandProperties = {
			   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1200")
			})
	public String makePay() throws InterruptedException {
		
		
		 Random random = new Random(); 
		  
	        // Generate random integers in range 0 to 999 
	        int randomNumber = random.nextInt(10); 
	        
	        if(randomNumber%2==0)
	        	Thread.sleep(1500);
		
		
		
		
		
		return " Payment success of amount ";
	}
	private String errorMessage() {
		
		   return "Request fails. It takes long time to response";
		}
}




/*


package com.example.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@SpringBootApplication
@RestController
@EnableHystrix
public class PaymentServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceDemoApplication.class, args);
	}
	
	@GetMapping("/makepaymentnow")
	@HystrixCommand(fallbackMethod = "errorMessage", commandProperties = {
			   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1200")
			})
	public String makePay() throws InterruptedException {
		
		 Random random = new Random(); 
		  
	        // Generate random integers in range 0 to 999 
	        int randomNumber = random.nextInt(10); 
	        
	        if(randomNumber%2==0)
	        	Thread.sleep(1500);
		
		
		
		return "Payment success";
	}
	private String errorMessage() {
		   return "Request fails. It takes long time to response";
		}
}
*/
