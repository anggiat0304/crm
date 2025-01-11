FROM openjdk:23
WORKDIR /app
COPY target/crm-0.0.1-SNAPSHOT.jar crm-1.0.0.jar
EXPOSE 8070
ENTRYPOINT ["java", "-jar", "crm-1.0.0.jar"]