package com.league.sapient.country.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {
	@JsonProperty("country_id")
	private String countryId;
	@JsonProperty("country_name")
	private String countryName;
	@JsonProperty("country_logo")
	private String countryLogo;
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
