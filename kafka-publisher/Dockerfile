FROM openjdk:11

WORKDIR /app
ADD build/libs/kafka-publisher-1.0.0.jar kafka-publisher.jar

EXPOSE 5000
ENTRYPOINT ["java","-Djava.net.preferIPv4Stack=true", "-jar","./kafka-publisher.jar"]
