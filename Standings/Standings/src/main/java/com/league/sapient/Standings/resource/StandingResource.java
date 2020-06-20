package com.league.sapient.Standings.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.league.sapient.Standings.model.Country;
import com.league.sapient.Standings.model.League;
import com.league.sapient.Standings.model.Standing;
import com.league.sapient.Standings.model.Team;

@RestController
@RequestMapping("/standing")
public class StandingResource {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/xyz")
	private List<Standing> getStanding(){
		List<Standing> standings = new ArrayList<>();
		try {
			Country[] countries = restTemplate.getForObject("http://localhost:8081/country/", Country[].class);
			
			List<League> leagues = Arrays.stream(countries).map(c->{
				return restTemplate.getForObject("http://localhost:8082/league/"+c.getCountryId(), League[].class);
			}).flatMap(Arrays::stream).collect(Collectors.toList());
			
			for(League league: leagues) {
				Team[] teams = restTemplate.getForObject("http://localhost:8083/team/"+league.getLeagueId(), Team[].class);
				for(Team t: teams) {
					standings.add(new Standing(league.getCountryId()+"-"+league.getCountryName(),
							league.getLeagueId()+"-"+league.getLeagueName(), t.getTeamKey()+"-"+t.getTeamName(), 0));
				}
			}
			
			return standings;
			
		}catch(Exception e) {
			e.printStackTrace();
			return new ArrayList<Standing>();
		}
	}
}
