package com.example.hystricClient.hystricClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.hystricClient.hystricClient")
public class HystricClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystricClientApplication.class, args);
	}
}
