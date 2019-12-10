FROM openjdk:7
COPY .
WORKDIR .
RUN javac Main.java
CMD ["java", "Main"]