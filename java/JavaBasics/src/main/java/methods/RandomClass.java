package methods;

public class RandomClass {

    public static void main(String[] args) {

        /*int x = scream();
        scream();
        scream();
        scream();*/

        starTree(8);
    }

    /*
    * What is a method?
    *   reusable block of code that is ran when it is called
    *
    * What is the difference between a method and a function?
    *   method: is a function that is tied to a class
    *   function: is not tied to anything
    * */

    //[return type] methodName(){}

    //void means it returns nothing
    static int scream(){
        System.out.println("AAAAAHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!!!!!!");

        return 5;
    }

    static void doubleNum(int num){
        System.out.println(num * 2);
    }

    static void starTree(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    * write a method passes in an integer
    * *
    * **
    * ***
    *
    * */
}
