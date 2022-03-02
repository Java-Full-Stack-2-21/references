package oop.polymorphism;

public class ChildClass extends ParentClass{
    Integer age;
    String firstname;
    String lastname;

    public ChildClass(Integer age, String firstname, String lastname){
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }


    /*
    * What is Overriding?
    *   Overriding is when a child method has the same method
    *       signature as a parent class
    * */
    public void drink(){
        System.out.println("Im drinking caprisun because im a child");
    }
}
