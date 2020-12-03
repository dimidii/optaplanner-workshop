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

During this workshop you will build a simplistic REST application that optimizes a school timetable for students and teachers,
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

## Test your application
Ubuntu/MacOS
```
./mvnw compile quarkus:dev OR mvn compile quarkus:dev
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
