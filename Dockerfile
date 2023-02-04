FROM openjdk:11
ADD target/docker-first-app.jar docker-first-app.jar

EXPOSE 7098
ENTRYPOINT ["java","-jar","docker-first-app.jar"]
