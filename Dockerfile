FROM openjdk:17
EXPOSE 8080
ADD target/java_advance.jar java_advance.jar
ENTRYPOINT ["java","-jar","/java_advance.jar"]