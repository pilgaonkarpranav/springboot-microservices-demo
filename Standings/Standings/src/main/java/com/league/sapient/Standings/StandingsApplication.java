package com.league.sapient.Standings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StandingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandingsApplication.class, args);
	}
	
	@Bean
	public RestTemplate getrestTemplate() {
		return new RestTemplate();
	}
}
