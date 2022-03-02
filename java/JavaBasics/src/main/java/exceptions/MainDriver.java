package exceptions;


import java.io.IOException;

/*
* EXCEPTIONS
*
* What is an Error?
*   an error indicates serious problems that our app should NOT try to "handle"
*
* What is an Exception?
*   an exception indicates problems in our app that we might want to try to "handle"
*
* What is a checked exception?
*   the compiler will give you a syntax error if you do not "handle" the exception
*
* What is an unchecked exception?
*   the compiler will NOT give you a syntax error if you do not "handle" the exception
*
* How do you handle an exception?
*   try, catch, finally
*
* How do you ignore an exception?
*   throws
*
* How do you explicitly throw an exception?
*   throw
* */
public class MainDriver {

    public static void main(String[] args) {
        throwCheckedException();
        //throwUncheckedException();
    }

    public static void throwCheckedException() {
        try {
            throw new SuperAwesomeException();
        }catch (SuperAwesomeException sae){
            sae.printStackTrace();
            System.out.println("IO Exception catch block");
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("Exception catch block");
        }finally {
            System.out.println("finally block will always run here");
        }
    }

    public static void throwUncheckedException(){
        int[] arr = {1,2,3,4,5};

        System.out.println(arr[5]); //runtime exception happens here because there is only 5
        //positions in the array and we are trying to access the 6th position. This
        //is giving us a runtime exception.
    }
}
