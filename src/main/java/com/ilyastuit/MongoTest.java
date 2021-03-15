package com.ilyastuit;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

public class MongoTest {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient(new ServerAddress("127.0.0.1", 27017));
        MongoDatabase db = mongoClient.getDatabase("links");
    }

}
