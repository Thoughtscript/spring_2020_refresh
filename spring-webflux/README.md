# spring-webflux-starter

[![](https://img.shields.io/badge/Java-1.8.0_123-yellowgreen.svg)](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
[![](https://img.shields.io/badge/Spring-WebFlux-green.svg)](https://spring.io/reactive)
[![](https://img.shields.io/badge/Gradle-6.5-darkslategray.svg)](https://gradle.org/)
[![](https://img.shields.io/badge/Maven-3.6.3-white.svg)](https://maven.apache.org)
[![](https://img.shields.io/badge/LICENSE-MIT-red.svg)](./LICENSE)

## Build

Maven:

1. `mvn clean`
1. `mvn install`

Gradle:

1. `./gradlew clean`
1. `./gradlew build`

## Run

Maven:

1. `mvn spring-boot:run`

Gradle:

1. `./gradlew run`

Java:

1. `java -jar ...`


## API Endpoints

1. http://localhost:8080/regularrest - GET - returns default HTTP REST response message as JSON
1. http://localhost:8080/functional - GET - returns default functional router message as JSON
1. http://localhost:8080/reactiverest - GET - returns default reactive REST message as JSON

## Notes

* Converted older examples from around `2.0.0` to latest spec (`2.3.3`)
* No longer using IntelliJ - using and getting familarized with Atom for Java and Java Spring
* Mostly programmatic configuration with optional `application.properties`
* No security or DB in this example
* HTTP 1.1/1.2 REST Reactive API endpoints only
* Blocking, synchronous REST API endpoints
* Java 8 not 10
* TODO: migrate over good integration and unit tests
