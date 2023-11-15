FROM 966432988823.dkr.ecr.us-east-1.amazonaws.com/openjdk:17

LABEL maintainer="devops@wakanda.academy"

WORKDIR /app

COPY target/Coopvotes-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["/app/startup.sh", "-jar", "Coopvotes-0.0.1-SNAPSHOT.jar"]