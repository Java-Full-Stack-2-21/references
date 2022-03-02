package oop.polymorphism;

public class MainDriver {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass(98, "Old", "Fart");



        //which method of drink is ran is dependent on how many arguments are passed
        /*parent.drink();
        parent.drink("V8 Juice");*/

        //when we upcast like this, we have all the fields and methods from the parent object.
        // The child instantiation is just implementing it
        ParentClass obj = new ChildClass(12, "Pee", "Wee"); //upcasting
        //obj.drink();
        System.out.println(((ChildClass)obj).firstname);



        /*
        * What is the difference between overriding and shadowing?
        *
        * overriding: deals with methods, when you override the parent method,
        *       the parent method doesnt exist for that object instance
        *
        * shadowing: deals with variables, when you shadow a child variable,
        *   the parent AND child variables still exist.
        * */

    }
}
