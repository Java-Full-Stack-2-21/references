import io.javalin.Javalin;
import io.javalin.http.Handler;

public class MainDriver {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(9000);

        // http://localhost:9000/
        app.get("/", context -> {
            System.out.println("ENDPOINT HIT!");
            context.result("Hello Javalin");
        });

        // http://localhost:9000/html
        app.get("/html", context -> {
           context.contentType("text/html");

           context.result("<html><body><h1>Hello Javalin</h1></body></html>");
        });

        app.get("/json", context -> {
            context.contentType("application/json");

            context.result("{\"username\": \"kev123\", \"password\": \"pass123\" }");
        });





        ///////sending data from client to server
        /*
        * - query param: http://localhost:9000/user?id=4
        * - path param: http://localhost:9000/user/4
        * - utilize the body to send json
        * */

        //query parameter
        app.get("/queryparam/user", context -> {
            //we are retrieve a query param with the key as username
            //?username=somevalue
            String username = context.queryParam("username");

            context.result("Hello, " + username + "!!!");

        });


        //path parameter
        app.get("/pathparam/user/{username}", context -> {
            String username = context.pathParam("username");

            context.result("Hello, " + username + "!!!");
        });


        app.post("/jsonbody/user", context -> {
            User user = context.bodyAsClass(User.class);

            context.json(user);
        });





    }
}
