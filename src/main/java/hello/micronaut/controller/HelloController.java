package hello.micronaut.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import java.time.LocalDate;

@Controller("/hello")
public class HelloController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String getHello() {
        return "Hello, Micronaut!";
    }

    @Get(value = "/{date}", produces = MediaType.TEXT_PLAIN)
    public String getHello(@PathVariable LocalDate date) {
        return "Hello @ " + date;
    }
}
