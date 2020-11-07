# spring_2020_refresh

[![](https://img.shields.io/badge/Java-1.8.0_123-yellowgreen.svg)](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
[![](https://img.shields.io/badge/Spring-Boot-green.svg)](https://spring.io/projects/spring-boot)
[![](https://img.shields.io/badge/Spring-WebFlux-green.svg)](https://spring.io/reactive)
[![](https://img.shields.io/badge/Gradle-6.5-darkslategray.svg)](https://gradle.org/)
[![](https://img.shields.io/badge/Maven-3.6.3-white.svg)](https://maven.apache.org)
[![](https://img.shields.io/badge/LICENSE-MIT-red.svg)](./LICENSE)

Samples using the latest and greatest Spring.io (Boot, WebFlux, Spring).

Examples include use of in-memory H2 db's.

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

## Notes

Nomenclature and classpath:

* `io.thoughtscript.refresh` - Spring Boot
* `io.thoughtscript.refresh.h2` - Spring Boot, Data JPA, H2
* `io.thoughtscript.refresh.webflux` - Spring WebFlux
* `io.thoughtscript.refresh.webflux.h2` - Spring WebFlux, Data JPA, Reactive H2
