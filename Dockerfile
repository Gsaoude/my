FROM openjdk:7
COPY C:\Users\George\Desktop\Hangman
WORKDIR C:\Users\George\Desktop\Hangman
RUN javac Main.java
CMD ["java", "Main"]