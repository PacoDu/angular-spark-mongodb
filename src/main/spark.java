package main;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import static spark.Spark.*;

public class spark {

    public static void main(String[] args) {
        get("/", (request, response) -> {
          MongoClient mongoClient = new MongoClient();
          MongoDatabase db = mongoClient.getDatabase("test");

          return db.getCollection("users").find().first().toJson();

        });
    }

}

