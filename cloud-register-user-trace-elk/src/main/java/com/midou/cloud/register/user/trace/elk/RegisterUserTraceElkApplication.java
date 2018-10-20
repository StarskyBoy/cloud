package com.midou.cloud.register.user.trace.elk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@EnableEurekaClient
@SpringBootApplication
public class RegisterUserTraceElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterUserTraceElkApplication.class, args);
	}
}
