package com.league.sapient.Standings.model;

public class Standing {
	private String countryDetails;
	private String leagueDetails;
	private String teamDetails;
	private int position;
	
	
	public Standing(String countryDetails, String leagueDetails, String teamDetails, int position) {
		super();
		this.countryDetails = countryDetails;
		this.leagueDetails = leagueDetails;
		this.teamDetails = teamDetails;
		this.position = position;
	}
	public String getCountryDetails() {
		return countryDetails;
	}
	public void setCountryDetails(String countryDetails) {
		this.countryDetails = countryDetails;
	}
	public String getLeagueDetails() {
		return leagueDetails;
	}
	public void setLeagueDetails(String leagueDetails) {
		this.leagueDetails = leagueDetails;
	}
	public String getTeamDetails() {
		return teamDetails;
	}
	public void setTeamDetails(String teamDetails) {
		this.teamDetails = teamDetails;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
}
