package com.midou.cloud.register.usermetadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegisterUserMetadataApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterUserMetadataApplication.class, args);
	}
}
