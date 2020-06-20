cd Standings/Standings
mvnw package
docker build -t springio/gs-spring-boot-docker-standing .
cd ../../country/country
mvnw package
docker build -t springio/gs-spring-boot-docker-country .
cd ../../league/league
mvnw package
docker build -t springio/gs-spring-boot-docker-league .
cd ../../team/team
mvnw package
docker build -t springio/gs-spring-boot-docker-team .
cd ../../

