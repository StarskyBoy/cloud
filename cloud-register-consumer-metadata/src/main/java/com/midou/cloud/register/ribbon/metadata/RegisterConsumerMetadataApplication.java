package com.midou.cloud.register.ribbon.metadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegisterConsumerMetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterConsumerMetadataApplication.class, args);
	}
}
