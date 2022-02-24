package classesandobjects;


import com.sun.tools.javac.Main;

/*
* What is a class?
*   a class is a blueprint of how we create objects
*
* What is an object?
*   an object is an instance of a class
*   objects have state (variable) and behavior (methods)
* */
public class Animal {
    ///////////////////////STATE (variables) //////////////////////////

    String name;
    int health = 0;

    /////////////////////BEHAVIORS (methods)///////////////////////////
    int heal(int healthToAdd){
        health = health + healthToAdd;
        return health;
    }


    ////////////////////Constructor///////////////////////////////

    /*
    * What is a constructor?
    *   a constructor is a method that is called when an object is instantiated (new keyword)
    *
    * */
    public Animal(String animalsName, int originalHealth){
        System.out.println("Animal Constructor with 2 arguments ran");
        name = animalsName;
        health = originalHealth;
    }

    public Animal(String literallyAnything){
        System.out.println("Animal Constructor with 1 argument ran");
        name = literallyAnything;
    }


    ////// initializer block: called everytime an object is instantiated
    {
        System.out.println("Initializer block");
    }

}
