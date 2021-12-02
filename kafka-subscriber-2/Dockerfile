FROM openjdk:11

WORKDIR /app
ADD build/libs/kafka-subscriber-2-1.0.0.jar kafka-subscriber-2.jar

EXPOSE 5002
ENTRYPOINT ["java","-Djava.net.preferIPv4Stack=true", "-jar","./kafka-subscriber-2.jar"]
