package com.midou.cloud.register.user.trace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication
public class RegisterUserTraceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterUserTraceApplication.class, args);
	}
}
