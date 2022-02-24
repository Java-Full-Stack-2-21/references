package nonaccessmodifiers; //what is this?

public class MainDriver { //TitleCase is the naming convention for classes
    /*
    * What are non-access modifiers?
    *   non-access modifiers are keywords that can manipulate specific entities
    *
    * Types of non-access modifiers
    *   - static
    *       static keyword means it is directly tied to the class
    *   - final
    *       the final keyword does something different dependent on what entity you put it on
    *       - variables: cannot change the value
    *       - methods: cannot be overridden
    *       - classes: cannot be inherited
    * */

    public static void main(String[] args) {
        /*StaticClass sc = new StaticClass();
        System.out.println(sc.staticVar);*/

        StaticClass.printHello();

        System.out.println(StaticClass.staticVar);
    }
}
