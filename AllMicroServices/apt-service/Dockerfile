FROM openjdk:8
EXPOSE 8080
VOLUME /tmp
COPY target/*.jar spring-boot-cassandra-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-boot-cassandra-0.0.1-SNAPSHOT.jar"]