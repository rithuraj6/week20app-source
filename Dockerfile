FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/week20app-1.0.0-SNAPSHOT.jar app.jar

EXPOSE 8082

CMD ["java","-jar","app.jar"]