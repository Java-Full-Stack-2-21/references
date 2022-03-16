import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;


/*
* What is javalin?
*   dependency that provides server software which allows our backend to actively look for http requests and send http responses
*
* What is HTTP?
*   HyperText Transfer Protocol
*   - transferring data between computers
*   - Examples: html, json, xml.... but we will be utilizing json primarily
*
* What is in a HTTP request?
*   - HTTP VERB - gives us information on what action we should take
*       - POST - creating entities
*       - PATCH - update an entity partially
*       - PUT - updating an entity fully
*       - GET - retrieve entities
*       - DELETE - delete entity
*   - Header - meta data added to the request and response
*       - Content-Type = "application/json"
*   - Body - the data we are passing to the server
*
* What is in a HTTP response?
*   - Status code - let us know how successful the request was
*       - 100s - information
*       - 200s - successful
*       - 300s - redirects
*       - 400s - client side errors
*       - 500s - server side errors
*   - Header - meta data added to the request and response
*   - Body - the data we are passing back to the client
*
* What is json?
*   - JavaScript Object Notation
*   - universal file format for transferring data
*
* What is jackson?
*   converts json strings to java objects and visa versa
*   - ObjectMapper
*       - writeValueAsString(Object obj); - converts object to json string
*       - readValue(jsonstring, User.class); - converts json string to object
*
* What is a functional interface?
*   - an interface with exactly 1 abstract method
*
* What is a lambda?
*   a way to implement functional interface inline
*
* */
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
        * - form param: forms in html
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


        //utilizing the body to send json string to server
        app.post("/jackson/user", context -> {

            //context.header("Content-Type", "application/json");
            //context.contentType("application/json");
            /*
            * What is jackson?
            *   jackson is a dependency that allows us to convert json strings to java objects and visa versa
            * */
            ObjectMapper objectMapper = new ObjectMapper();
            String json = context.body();

            User user = objectMapper.readValue(json, User.class);
            //User user2 = context.bodyAsClass(User.class);



            //System.out.println(context.body());

            //context.json(user);
            context.result(objectMapper.writeValueAsString(user));
        });

        app.post("/jsonbody/user", context -> {
            User user = context.bodyAsClass(User.class);

            context.json(user);

        });


        //form params
        app.post("/formparam/user", context -> {
            String firstname = context.formParam("firstname");
            String lastname = context.formParam("lastname");

            User user = new User(firstname,lastname);

            context.status(418);

            context.json(user);
        });


        app.get("/piglatin/{word}", MainDriver::pigLatin);





    }

    public static void pigLatin(Context context){
        String word = context.pathParam("word");

        context.json(new StringBuilder("").append(word.substring(1)).append(word.charAt(0)).append("ay"));
    }
}
