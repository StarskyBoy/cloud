package com.midou.cloud.hystrix.turbine.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@SpringBootApplication
public class HystrixTurbineMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineMqApplication.class, args);
	}
}
