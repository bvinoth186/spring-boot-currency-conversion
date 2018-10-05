package com.springboot.currency.conversion.springbootcurrencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.springboot.currency.conversion.springbootcurrencyconversion")
@EnableDiscoveryClient
public class SpringBootCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCurrencyConversionApplication.class, args);
	}
}
