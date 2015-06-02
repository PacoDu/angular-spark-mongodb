package org.friends.sparkjava.test;

import static spark.Spark.*;

public class spark {

    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World");
    }
}

