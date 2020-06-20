package com.league.sapient.league;

import org.hobsoft.spring.resttemplatelogger.LoggingCustomizer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LeagueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeagueServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate getrestTemplate() {
		return new RestTemplateBuilder()
				.customizers(new LoggingCustomizer())
				.build();
	}

}
