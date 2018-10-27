package com.midou.cloud.register.gateway.zuul.aggregation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableZuulProxy
@SpringBootApplication
public class RegisterGatewayZuulAggregationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterGatewayZuulAggregationApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
