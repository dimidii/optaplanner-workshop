# Optaplanner

OptaPlanner is an AI constraint solver. It optimizes planning and scheduling problems, such as the Vehicle Routing Problem, School Timetabling, Cloud Optimization,and many more. 

## Prerequisites
To complete this guide, you need:

 * IDE
 
 * ~30 minutes

 * JDK 1.8+ installed with JAVA_HOME configured

 * Apache Maven 3.6.2+ or Gradle 4+
 
 * [EXTRA] Postman

## Assigment

During this workshop you will build a simplistic REST application that optimizes a school timetable for students and teachers, look at the 'model_diagram' figure inside this repository to get a better overview of the assigment.
Your service will assign Lesson instances to Timeslot and Room instances automatically by using AI to adhere to hard and soft scheduling constraints.

Use https://code.quarkus.io/ to generate an application with the following extensions, for Maven or Gradle:

 * RESTEasy JAX-RS (quarkus-resteasy)

 * RESTEasy Jackson (quarkus-resteasy-jackson)

 * OptaPlanner (optaplanner-quarkus)

 * OptaPlanner Jackson (optaplanner-quarkus-jackson)

Alternatively, generate it from the command line with Maven:
```
mvn io.quarkus:quarkus-maven-plugin:1.10.2.Final:create \
    -DprojectGroupId=org.acme \
    -DprojectArtifactId=optaplanner-quickstart \
    -Dextensions="resteasy,resteasy-jackson,optaplanner-quarkus,optaplanner-quarkus-jackson"
cd optaplanner-quickstart
```
Or clone the repository on your machine and reload the pom file so the dependancies can be installed and used.

## Test your application
Open a new terminal inside the IDE and run the following commands.

Ubuntu/MacOS
```
./mvnw compile quarkus:dev
```
Windows
```
mvnw compile quarkus:dev
```
Open another terminal, or use Postman to make a POST request to the API endpoint.
```
curl -i -X POST http://localhost:8080/timeTable/solve -H "Content-Type:application/json" -d '{"timeslotList":[{"dayOfWeek":"MONDAY","startTime":"08:30:00","endTime":"09:30:00"},{"dayOfWeek":"MONDAY","startTime":"09:30:00","endTime":"10:30:00"}],"roomList":[{"name":"Room A"},{"name":"Room B"}],"lessonList":[{"id":1,"subject":"Math","teacher":"A. Turing","studentGroup":"9th grade"},{"id":2,"subject":"Chemistry","teacher":"M. Curie","studentGroup":"9th grade"},{"id":3,"subject":"French","teacher":"M. Curie","studentGroup":"10th grade"},{"id":4,"subject":"History","teacher":"I. Jones","studentGroup":"10th grade"}]}'
```
And that's it, Optaplanner start solving. Check the terminal in which you start Quarkus.

## Build with Docker
Open a new terminam and make sure that you are in the optaplanner-workshop directory. After you're ready run the following commands.

```
mvn package
```

```
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/octaplanner-quarkus-jvm .
```

```
docker run -i --rm -p 8080:8080 quarkus/octaplanner-quarkus-jvm
```

Note: if you are using Linux and got permission denied run the same command as sudo.
