FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY pom.xml ./
COPY mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:go-offline

COPY src ./src
RUN ./mvnw package -DskipTests

EXPOSE 8080
CMD ["java", "-jar", "target/inovasi_daya_solusi-0.0.1-SNAPSHOT.jar"]
