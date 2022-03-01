package oop.abstraction;

/*
* if you are in an interface:
*   - you can extend other interfaces
*
* if you are in a class:
*   - you can extend one other class
*   - you can implement multiple interfaces
* */

public class SemiTruck implements Truck{

    public void drive() {
        System.out.println("VVVRRRRROOOOOOOMMMMMMMM");
    }

    public void speed(){
        System.out.println("IM zoomin");
    }

    public void honk(){
        System.out.println("HONK");
    }

}
