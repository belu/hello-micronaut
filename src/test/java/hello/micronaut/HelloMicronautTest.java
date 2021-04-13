package hello.micronaut;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class HelloMicronautTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    void testGetHello() {
        String response = client.toBlocking().retrieve(HttpRequest.GET("/hello"));
        assertEquals("Hello, Micronaut!", response);
    }

    @Test
    void testGetHelloWithDate() {
        String response = client.toBlocking().retrieve(HttpRequest.GET("/hello/1995-09-21"));
        assertEquals("Hello @ 1995-09-21", response);
    }
}
