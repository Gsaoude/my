FROM openjdk:8
ADD Hangman.jar
EXPOSE 8085
ENTRYPOINT ["java", "jar", "Hangman.jar"]