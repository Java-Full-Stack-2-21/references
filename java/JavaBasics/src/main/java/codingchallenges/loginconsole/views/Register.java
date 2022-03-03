package codingchallenges.loginconsole.views;

import codingchallenges.loginconsole.models.User;
import codingchallenges.loginconsole.services.LoginService;

import java.util.Scanner;

public class Register {
    public static void view(){
        LoginService loginService = new LoginService();
        Scanner sc = new Scanner(System.in);

        User user = new User();
        System.out.println("REGISTER!");
        System.out.print("Username: ");
        user.setUsername(sc.nextLine());

        System.out.print("Password: ");
        user.setPassword(sc.nextLine());

        System.out.println("First Name: ");
        user.setFirstname(sc.nextLine());

        System.out.println("Last Name: ");
        user.setLastname(sc.nextLine());

        loginService.addUser(user);

    }
}
