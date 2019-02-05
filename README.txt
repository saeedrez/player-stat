Framework used: 
spring boot: it offers all the necessary tools to be able to develop a full-stack web application: springMVC for REST API, spring DI, spring data for data persistence, inmemory H2 database, support for flyway data migration tool, embedded Tomcat container
Maven: creates a standard development env

Architecture: standard webapplication/webservice architecture with separation-of-concerns layers: controller, repository, init, model...

How the program works: when the application comes up, the embedded H2 in-memory Db is initialized, the cvs data-file is read and its content inserted into the DB. The REST API is then ready to accept requests.

What is missing: unittests and a proper client (I am a backend developer so I am not very good at client side UI stuff!). Right now the data is returned to browser as json.


How to build and run: (jvm 1.7 and higher is required to be able to compile and run the application):
1) I have included the jar file just in case, but otherwise, the application can be built using "mvn package"

2) to run: open a commandline prompt, navigate to the project folder, then type:
mvn spring-boot:run

The REST API is then ready to accept requests thru the following 2 urls:

To get a list of all players: http://localhost:8080/api/v1/players
To get a single player using playerId: http://localhost:8080/api/v1/players/5583
