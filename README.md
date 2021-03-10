# RediSearch REST Server: Java with Jedis

The goal of this application is to show how to develop a RediSearch application with Java.

This project is a Spring Boot application.

This application uses [JRediSearch](https://github.com/RediSearch/JRediSearch) that is based on [Jedis](https://github.com/xetorthio/jedis).

This application exposes various endpoint that are directly consumable in a front end.


## How to run it locally?

### Running the application in Docker

You can run build and run the application from docker using the following commands:

**Build & Run**

```shell script

> docker-compose up --build

```

You can now access the app using the following URL:

* http://localhost:8084
