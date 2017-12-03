package com.codehobby.powerball;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.codehobby.powerball")
@SpringBootApplication
public class PowerballWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerballWebsiteApplication.class, args);
	}
}
