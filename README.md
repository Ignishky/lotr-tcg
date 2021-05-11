[![Build Status](https://api.travis-ci.com/Ignishky/lotr-tcg.svg?branch=master)](https://travis-ci.com/github/Ignishky/lotr-tcg)
[![Coverage Status](https://coveralls.io/repos/github/Ignishky/lotr-tcg/badge.svg)](https://coveralls.io/github/Ignishky/lotr-tcg)

# lotr-tcg

## Prerequisite
- Java 11+
- Maven 3
- Docker

## Build

```shell script
mvn clean install
```

## Run

```shell script
java -jar ./server/target/server-X.X.jar
```

## Use

### Swagger

http://localhost:9090/swagger-ui/

### Vuejs

http://localhost:9090/index.html

## Site

https://ignishky.github.io/lotr-tcg/

### Build & publish

```shell script
mvn clean site site:stage
mvn scm-publish:publish-scm
```
