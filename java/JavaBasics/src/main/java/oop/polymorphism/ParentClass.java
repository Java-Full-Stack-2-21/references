package oop.polymorphism;



/*
* What is overloading?
*   overloading is having the same method name in the SAME class
*   but different parameters
*
* */
public class ParentClass {
    Integer age;
    String firstname;
    String lastname;

    public ParentClass(Integer age, String firstname, String lastname){
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public void drink(){
        System.out.println("Im drinking a moscow mule");
    }

    public void drink(String liquid){
        System.out.println("Im drinking a " + liquid);
    }
}
