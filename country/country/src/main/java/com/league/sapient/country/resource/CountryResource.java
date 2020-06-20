package com.league.sapient.country.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.league.sapient.country.model.Country;

@RestController
@RequestMapping("/country")
public class CountryResource {
	@Value("$(api.key)")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	private Country[] getCountries(){
		try {
			return restTemplate.getForObject("https://apiv2.apifootball.com/?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", Country[].class);
		}catch(Exception e) {
			e.printStackTrace();
			return new Country[0];
		}
	}
}
