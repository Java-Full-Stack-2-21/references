package wrapperclasses;

public class MainDriver {
    /*
    * What is a wrapper class?
    *   Wrapper classes are classes that "wrap" around the corresponding primitive.
    *   essentially it is the class version of the primitive.
    *
    * primitives and the wrapper equivalent:
    * - boolean - Boolean
    * - byte - Byte
    * - char - Character
    * - short - Short
    * - int - Integer
    * - float - Float
    * - long - Long
    * - double - Double
    *
    * Why do they exist?
    *   - wrapper classes can have methods (because classes can have methods)
    *   - there are data structures (in the future) that dont take the primitive
    * */
    public static void main(String[] args){

        Boolean b = true; //autoboxing
        Boolean b1 = new Boolean(true); // line through means its deprecated.
        Boolean b2 = Boolean.TRUE;

        Byte byt = 10; //autoboxing

        Character c = 'c'; //autoboxing

        Float f = 126F;

        char x = c; //unboxing


        method1(5); // the number 5 is being autoboxed to the wrapper equivalent in the method

        /*
        * What is autoboxing?
        *   the idea of having a primitive type automatically
        *   being converted to the correlated Wrapper class equivalent
        *
        * What is unboxing?
        *   unboxing is converting a wrapper to its correlated primitive;
        *
        * */

    }

    static void method1(Integer num){
    }

}
