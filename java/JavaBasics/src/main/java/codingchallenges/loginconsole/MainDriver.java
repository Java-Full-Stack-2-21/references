package codingchallenges.loginconsole;

import codingchallenges.loginconsole.views.Login;
import codingchallenges.loginconsole.views.Register;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean running = true;

        while (running){
            System.out.println("WELCOME TO OUR LOGIN APP PRACTICE");
            System.out.println("1) Login");
            System.out.println("2) Register");
            System.out.println("0) Exit");

            String input = sc.nextLine();

            switch (input){
                case "1":
                    Login.view();
                    break;
                case "2":
                    Register.view();
                    break;
                case "0":
                    running = false;
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }






    }
}
