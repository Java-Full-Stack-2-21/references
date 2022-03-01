package oop.abstraction;

/*
* abstract classes are partially abstract... meaning we can have methods
* with implementations
* */
public abstract class Car {

    abstract void drive();

    void honk(){
        System.out.println("meep meep");
    }
}
