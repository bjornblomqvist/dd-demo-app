import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        externalStaticFileLocation("./angularjs/app/");
        staticFileLocation("/public");
        get("/hello", (req, res) -> "Hello World");
    }
}