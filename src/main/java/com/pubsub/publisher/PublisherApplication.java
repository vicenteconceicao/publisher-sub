package com.pubsub.publisher;

import com.pubsub.publisher.service.GoogleSubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublisherApplication.class, args);
		GoogleSubscriberService.subscribeAsync();
	}
}
