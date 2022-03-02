package oop.inheritance;

public class Pikachu extends Pokemon{
    //eventhough this class has no fields, we still inherit
    // the traits from the class Pokemon (the parent)

    /*
    * "this" keyword references the specific class that you are in
    *   - constructors
    *   - variables
    *   - methods
    *
    * "super" keyword references from the parent class
    *   - variables
    *   - methods
    *   - constructors
    * */

    //constructors have the "super();" on the first line implicitly
    Pikachu(){
        System.out.println("Health: " + this.health);

        this.takeDamage();
    }


    Pikachu(Integer id, String name, Integer health){
        super();
    }

}
