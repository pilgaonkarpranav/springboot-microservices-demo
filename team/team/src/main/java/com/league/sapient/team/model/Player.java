
package com.league.sapient.team.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "player_key",
    "player_name",
    "player_number",
    "player_country",
    "player_type",
    "player_age",
    "player_match_played",
    "player_goals",
    "player_yellow_cards",
    "player_red_cards"
})
public class Player {

    @JsonProperty("player_key")
    private Long playerKey;
    @JsonProperty("player_name")
    private String playerName;
    @JsonProperty("player_number")
    private String playerNumber;
    @JsonProperty("player_country")
    private String playerCountry;
    @JsonProperty("player_type")
    private String playerType;
    @JsonProperty("player_age")
    private String playerAge;
    @JsonProperty("player_match_played")
    private String playerMatchPlayed;
    @JsonProperty("player_goals")
    private String playerGoals;
    @JsonProperty("player_yellow_cards")
    private String playerYellowCards;
    @JsonProperty("player_red_cards")
    private String playerRedCards;

    @JsonProperty("player_key")
    public Long getPlayerKey() {
        return playerKey;
    }

    @JsonProperty("player_key")
    public void setPlayerKey(Long playerKey) {
        this.playerKey = playerKey;
    }

    @JsonProperty("player_name")
    public String getPlayerName() {
        return playerName;
    }

    @JsonProperty("player_name")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @JsonProperty("player_number")
    public String getPlayerNumber() {
        return playerNumber;
    }

    @JsonProperty("player_number")
    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    @JsonProperty("player_country")
    public String getPlayerCountry() {
        return playerCountry;
    }

    @JsonProperty("player_country")
    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }

    @JsonProperty("player_type")
    public String getPlayerType() {
        return playerType;
    }

    @JsonProperty("player_type")
    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    @JsonProperty("player_age")
    public String getPlayerAge() {
        return playerAge;
    }

    @JsonProperty("player_age")
    public void setPlayerAge(String playerAge) {
        this.playerAge = playerAge;
    }

    @JsonProperty("player_match_played")
    public String getPlayerMatchPlayed() {
        return playerMatchPlayed;
    }

    @JsonProperty("player_match_played")
    public void setPlayerMatchPlayed(String playerMatchPlayed) {
        this.playerMatchPlayed = playerMatchPlayed;
    }

    @JsonProperty("player_goals")
    public String getPlayerGoals() {
        return playerGoals;
    }

    @JsonProperty("player_goals")
    public void setPlayerGoals(String playerGoals) {
        this.playerGoals = playerGoals;
    }

    @JsonProperty("player_yellow_cards")
    public String getPlayerYellowCards() {
        return playerYellowCards;
    }

    @JsonProperty("player_yellow_cards")
    public void setPlayerYellowCards(String playerYellowCards) {
        this.playerYellowCards = playerYellowCards;
    }

    @JsonProperty("player_red_cards")
    public String getPlayerRedCards() {
        return playerRedCards;
    }

    @JsonProperty("player_red_cards")
    public void setPlayerRedCards(String playerRedCards) {
        this.playerRedCards = playerRedCards;
    }

}
