FROM openjdk:8
EXPOSE 8080
VOLUME /tmp
COPY target/*.jar demo-1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-1-0.0.1-SNAPSHOT.jar"]