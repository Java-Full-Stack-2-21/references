import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import models.JsonResponse;
import models.User;

public class MainDriver {
    public static void main(String[] args) {
        /*
        *
        * Sessions are temporary data stored on a server.
        *   - We can use sessions to retrieve user info as well as authentication
        *
        * */


        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH);
        }).start(9000);


        app.post("/login", ctx -> {
            User credentials = ctx.bodyAsClass(User.class);
            String role = "EMPLOYEE";
            //validate credentials are correct in the database
            User userFromDb = new User(1, credentials.getUsername(), credentials.getPassword(),role);

            //create variable in session
            ctx.sessionAttribute("user", userFromDb);

            ctx.json(new JsonResponse(true, "credentials valid and session attribute user created", userFromDb));

        });

        app.get("/check-session", ctx -> {
           User user = ctx.sessionAttribute("user");

           if(user == null){
               ctx.json(new JsonResponse(false, "You are not logged in... redirecting", null));
           }else{
               ctx.json(new JsonResponse(true, "User is logged in", user));
           }

        });


        app.delete("/logout", ctx -> {
            ctx.sessionAttribute("user", null);

            ctx.json(new JsonResponse(true, "session has been invalidated", null));
        });
    }
}
