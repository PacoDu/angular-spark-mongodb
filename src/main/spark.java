package main;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

import static spark.Spark.*;

public class spark {

    public static void main(String[] args) {
        port(8080);

        get("/", (request, response) -> {
          MongoClient mongoClient = new MongoClient();
          MongoDatabase db = mongoClient.getDatabase("test");

          return JSON.serialize(db.getCollection("users").find()); //.toJson();

        });
    }

}

