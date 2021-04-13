## Hello, Micronaut!

Run application in development mode:
```shell script
mvn clean mn:run
```

Use cURL to query endpoints:
```shell script
curl http://localhost:8080/hello
curl http://localhost:8080/hello/2021-04-13
```

### Native image

Build:
```shell script
mvn clean package -Dpackaging=native-image
```

Run:
```shell script
./target/hello-micronaut
```