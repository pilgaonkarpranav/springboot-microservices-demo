package com.league.sapient.team.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.league.sapient.team.model.Team;

@RestController
@RequestMapping("/team")
public class TeamResource {
	@Value("$(api.key)")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{league}")
	private Team[] getTeam(@PathVariable("league") String league){
		try {
			return restTemplate.getForObject("https://apiv2.apifootball.com/?action=get_teams&league_id="+league+"&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", Team[].class);
		}catch(Exception e) {
			e.printStackTrace();
			return new Team[0];
		}
	}
}
