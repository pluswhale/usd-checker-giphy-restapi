FROM openjdk:11

EXPOSE 8080

RUN mkdir ./app

COPY ./usd-checker-0.0.1.jar ./app

CMD java -jar ./app/usd-checker-0.0.1.jar