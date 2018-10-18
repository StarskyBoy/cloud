package com.midou.cloud.register.user.trace.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegisterUserTraceZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterUserTraceZipkinApplication.class, args);
	}
}
