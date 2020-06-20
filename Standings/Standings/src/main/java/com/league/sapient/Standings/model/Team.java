
package com.league.sapient.Standings.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "team_key",
    "team_name",
    "team_badge",
    "players",
    "coaches"
})
public class Team {

    @JsonProperty("team_key")
    private String teamKey;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("team_badge")
    private String teamBadge;
    @JsonProperty("players")
    private List<Player> players = null;
    @JsonProperty("coaches")
    private List<Coach> coaches = null;

    @JsonProperty("team_key")
    public String getTeamKey() {
        return teamKey;
    }

    @JsonProperty("team_key")
    public void setTeamKey(String teamKey) {
        this.teamKey = teamKey;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("team_badge")
    public String getTeamBadge() {
        return teamBadge;
    }

    @JsonProperty("team_badge")
    public void setTeamBadge(String teamBadge) {
        this.teamBadge = teamBadge;
    }

    @JsonProperty("players")
    public List<Player> getPlayers() {
        return players;
    }

    @JsonProperty("players")
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @JsonProperty("coaches")
    public List<Coach> getCoaches() {
        return coaches;
    }

    @JsonProperty("coaches")
    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

}
