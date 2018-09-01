package com.midou.cloud.register.registeruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegisterUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterUserApplication.class, args);
	}
}
