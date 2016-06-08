package org.elwaxoro.restcow;

import com.github.ricksbrown.cowsay.Cowsay;

import java.util.ArrayList;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Application {

    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/say", (req, res) -> {
            ArrayList<String> cargs = new ArrayList<>();
            String message = req.queryParams("msg");
            if (message == null) {
                message = "You did it wrong";
            }
            cargs.add("--html");

            if (req.queryParams("f") != null) {
                cargs.add("-f");
                cargs.add(req.queryParams("f"));
            }

            cargs.add(message);

            if (req.queryParams("cowthink") != null) {
                return Cowsay.think(cargs.toArray(new String[] {}));
            } else {
                return Cowsay.say(cargs.toArray(new String[] {}));
            }
        });
    }
}
