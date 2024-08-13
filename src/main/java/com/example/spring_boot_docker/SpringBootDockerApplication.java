package com.example.spring_boot_docker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication

public class SpringBootDockerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDockerApplication.class, args);
		log.info("started spring boot application ...");
	}

}
