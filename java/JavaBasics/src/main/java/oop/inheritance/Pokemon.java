package oop.inheritance;

/// this is going to be our parent class
public class Pokemon {
    Integer id = 0;
    String name = "anonymous";
    Integer health = 100;


    void takeDamage(){
        health = health - 10;
    }

    Pokemon(){
        System.out.println("In parent constructor");
    }

}
