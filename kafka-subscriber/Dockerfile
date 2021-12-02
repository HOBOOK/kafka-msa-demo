FROM openjdk:11

WORKDIR /app
ADD build/libs/kafka-subscriber-1.0.0.jar kafka-subscriber.jar

EXPOSE 5001
ENTRYPOINT ["java","-Djava.net.preferIPv4Stack=true", "-jar","./kafka-subscriber.jar"]
