package com.gemography.repos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReposApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReposApplication.class, args);
		
        
	}
	@Bean 
	public Github getGithub() {
		return new Github();
	}
	@Bean 
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
