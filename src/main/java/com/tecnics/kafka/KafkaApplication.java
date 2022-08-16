package com.tecnics.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafka) {
		return args -> {
			for(int i = 0; i < 10; i ++) {
				kafka.send("sometopic", "hello from kafka :_" + i);
			}
		};
	}

}
