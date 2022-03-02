package strings;

public class MainDriver {
    public static void main(String[] args) {
        /*
        * What is a String?
        *   it is an array of characters
        *
        * NOTE: String is NOT a primitive type... it is a class in java
        *
        * - A string is immutable... meaning it cant be changed.
        *
        * */
        String str = "Hello Strings!";
        str = "Hello!";
        System.out.println(str);


        /*
        * StringBuffer is mutable AND it is synchronized (threadsafe)
        * */
        StringBuffer sbuff = new StringBuffer("In the end");
        sbuff.append(", it doesnt even matter");

        System.out.println(sbuff);

        /*
        * StringBuilder is mutable AND it is NOT synchonized (not threadsafe)
        * */
        StringBuilder sbuild = new StringBuilder("Hello");
        sbuild.append(" from the other siiiiiiiiiide");
        sbuild.reverse();

        System.out.println(sbuild);

        System.out.println(isPalindrome("raceca"));


        //all objects inherit from the class Object...
        // meaning they inherit the methods below
        Object obj = new Object();
        //obj.equals() .equals() compares value and same data type
        //obj.toString()  string representation of the object
        //obj.hashCode() converts the object to a numerical value

        User user = new User();
        user.firstname = "Kevin";
        user.lastname = "Childs";

        System.out.println(user.toString()); //we overridden

        Child child = new Child();
        System.out.println(child.toString());

    }


    static Boolean isPalindrome(String word){
        String reverseWord = new StringBuilder(word).reverse().toString();

        return word.equals(reverseWord);
    }
}
