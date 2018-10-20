package com.midou.cloud.trace.zipkin.server.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class TraceZipkinServerStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraceZipkinServerStreamApplication.class, args);
	}
}
