# Football Standing Microservice

This application displays Teams, country, leagues and standings.

## Installation

```bash
build.bat
```

## Usage

```python
GET: Countries
http://localhost:8081/country/
[{"country_id":"41","country_name":"England","country_logo":"https://apiv2.apifootball.com/badges/logo_country/41_england.png"},{"country_id":"46","country_name":"France","country_logo":"https://apiv2.apifootball.com/badges/logo_country/46_france.png"}]

GET: Leagues by country
http://localhost:8082/league/41
[{"country_id":"41","country_name":"England","league_id":"149","league_name":"Championship","league_season":"2019/2020","league_logo":"https://apiv2.apifootball.com/badges/logo_leagues/149_championship.png","country_logo":"https://apiv2.apifootball.com/badges/logo_country/41_england.png"}]

GET Teams by league
http://localhost:8083/team/149
[{"team_key":"2618","team_name":"Swansea","team_badge":"https://apiv2.apifootball.com/badges/2618_swansea.png","players":[{"player_key":2643464408,"player_name":"Woodman Frederick","player_number":"27","player_country":"England","player_type":"Goalkeepers","player_age":"23","player_match_played":"37","player_goals":"0","player_yellow_cards":"1","player_red_cards":"0"},{"player_key":1165947433,"player_name":"Bidwell Jake","player_number":"24","player_country":"England","player_type":"Defenders","player_age":"27","player_match_played":"28","player_goals":"0","player_yellow_cards":"3","player_red_cards":"1"},{"player_key":2111977679,"player_name":"Cabango Benjamin","player_number":"44","player_country":"Wales","player_type":"Defenders","player_age":"19","player_match_played":"13","player_goals":"0","player_yellow_cards":"2","player_red_cards":"0"},{"player_key":1070039370,"player_name":"Guehi Marc","player_number":"2","player_country":"England","player_type":"Defenders","player_age":"19","player_match_played":"5","player_goals":"0","player_yellow_cards":"0","player_red_cards":"0"},{"player_key":2844326001,"player_name":"Naughton Kyle","player_number":"26","player_country":"England","player_type":"Defenders","player_age":"31","player_match_played":"27","player_goals":"3","player_yellow_cards":"4","player_red_cards":"0"},{"player_key":2044952129,"player_name":"Roberts Connor","player_number":"23","player_country":"Wales","player_type":"Defenders","player_age":"24","player_match_played":"30","player_goals":"0","player_yellow_cards":"2","player_red_cards":"0"}.......

GET Standings
http://localhost:8084/standing/xyz
[{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2618Swansea","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2622Huddersfield","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2624Stoke City","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2625West Brom","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2631Birmingham","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2633Hull City","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2634Nottingham","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2637Cardiff","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2638Millwall","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2639Fulham","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2642Derby","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2643Preston","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2644Brentford","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2645QPR","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2647Reading","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2648Middlesbrough","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2650Bristol City","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2651Sheffield Wed","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2652Barnsley","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2653Leeds","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2663Charlton","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2679Wigan","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2680Blackburn","position":0},{"countryDetails":"41-England","leagueDetails":"149-Championship","teamDetails":"2695Luton","position":0}]
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)