package com.sp.reactive;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableFeignClients
@ConfigurationPropertiesScan
@EnableMongoRepositories(basePackages = "com.sp.reactive.repository")
@RequiredArgsConstructor
public class MongoApplication {
	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(MongoApplication.class, args);
	}
}
