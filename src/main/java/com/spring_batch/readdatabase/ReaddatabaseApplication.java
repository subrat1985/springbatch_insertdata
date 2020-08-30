package com.spring_batch.readdatabase;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableBatchProcessing
@ComponentScan(basePackages = {"com.spring_batch.readdatabase"})
public class ReaddatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReaddatabaseApplication.class, args);
	}

}
