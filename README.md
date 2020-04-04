[![Build Status](https://travis-ci.org/Ignishky/lotr-tcg.svg?branch=master)](https://travis-ci.org/Ignishky/lotr-tcg)
[![Coverage Status](https://coveralls.io/repos/github/Ignishky/lotr-tcg/badge.svg)](https://coveralls.io/github/Ignishky/lotr-tcg)

# lotr-tcg

## Build

```shell script
mvn clean install
```

## Use

### Server

```shell script
java -jar ./server/target/server-X.X.jar
```

http://localhost:8080

## Site

https://ignishky.github.io/lotr-tcg/

### Build & publish

```shell script
mvn clean site site:stage
mvn scm-publish:publish-scm
```
