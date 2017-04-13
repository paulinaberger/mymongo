package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@EnableIntegration
@ImportResource({"classpath*:**/twitter-integration-connection.xml"})
public class DemoSIApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSIApplication.class, args);
	}
}
