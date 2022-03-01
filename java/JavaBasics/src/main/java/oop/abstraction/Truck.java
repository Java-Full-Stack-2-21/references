package oop.abstraction;

/*
* What is an interface?
*   is a contract between the interface itself, and the classes that implement
*
* */
public interface Truck{

    //variables in an interface are implicitly public, static and final
    int yearMade = 1992;


    //methods in an interface by default are public and abstract
    void drive();

    void speed();

    //you can have an implementation in an interface using the default keyword
    //add after java 8
    default void hello(){
        System.out.println("Hello");
    }

}
