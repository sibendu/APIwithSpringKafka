package com.sd.examples;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class SimulateResponse {
	 
	 @KafkaListener(topics = "${kafka.topic.request-topic}")
	 @SendTo
	  public Customer listen(Customer cust) throws InterruptedException {
		 
		 cust.setName("S Das");
		 cust.setAge(41);
		 return cust;
	  }

}
