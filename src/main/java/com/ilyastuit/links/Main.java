package com.ilyastuit.links;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {

    public static final String BASE_URI = "http://localhost:8080/api";

    public static HttpServer startServer() {
        final ResourceConfig rc = new ResourceConfig().packages("com.ilyastuit.links.resources");

        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), rc);
    }

    public static void main(String[] args) throws IOException {
        final HttpServer httpServer = startServer();
        System.out.println("Hit enter to stop it!");

        System.in.read();
        httpServer.shutdownNow();
    }
}
