package basics;

//what is this? This is a single line comment  shortcut: ctrl + /

/*
* What is this?
*   multi line comment  shortcut: ctrl + shift + /
* */

/*
* What is a package?
*   - a package generally contains like classes.
*   - packages help give your java project an organized structure
* */

/**
 * What is this?
 *      JavaDocs - creates documentation for your own methods and classes
 */
public class MainDriver {
    public static void main(String[] args) {

        /*
        * What are the primitive data types of java?
        *   - Bitter: boolean (1 bit)
        *   - Black: byte (1 byte) NOTE: 1 byte = 8 bits 2^7 - 1
        *   - Coffee: char (2 bytes)
        *   - Sure: short (2 bytes)
        *   - Is: int (4 bytes)
        *   - For: float (4 bytes)
        *   - Long: long (8 bytes)
        *   - Days: double (8bytes)
        *
        * What is a variable?
        *   basic unit of storage in a program.
        *
        * [data type] variableName = [value to give variable];
        *
        * java is a strongly typed language... meaning you have to explicitly declare the datatypes
        * */


        //true of false datatype
        boolean anything = false;

        //whole numbers
        byte b = 127;
        short s = 11;
        int i = 12;
        long l = 13;

        //decimal numbers
        double dble = 3.14;
        float flt = 3.14f;

        //one character
        char chr = 'a';
        //char chr2 = 65;



        //print statement shortcut is  sout + enter
        System.out.println(anything);

        //System.out.println(chr2);

        /*
        * What is flow control?
        *   tools we can utilize to manipulate when lines get executed
        *
        *   - if / else
        *   - while loops / do while loops
        *   - switch cases
        *   - for loops / enhanced for loop
        *
        * */


        int cFlow = 20;

        /*if(cFlow >= 30){
            System.out.println("Inside if condition");
        }

        if(cFlow >= 20){
            System.out.println("Inside else if condition");
        } */

        // || is for OR
        // && is for AND
        if(cFlow >= 30 || cFlow >= 20){
            System.out.println("Inside if condition");
            System.out.println("Inside else if condition");
        }


        /*else {
            System.out.println("Inside else condition");
        }*/

        int whileVar = 11;
        //while loops
        //
        while (whileVar < 10) {
            System.out.println(whileVar);

            whileVar = whileVar + 1;
        }

        //do while loop - runs the block of code at least once
        do {
            System.out.println(whileVar);

            whileVar = whileVar + 1;
        }while (whileVar < 10);

        //for loops

        int index = 10;
        //// ([Assignment of value]; [Boolean condition]; [statement to be executed after the block of code runs])
        for(index = 0; index < 10; index = index + 1){
            System.out.println("for loop: " + index);
        }


        //switch statements
        // switch statements attempt to match a value to a specific case
        //byte, short, char, int (respective wrapper classes) and String

        int sVal = 7;
        switch (sVal){
            case 1:
                System.out.println("1 hit!!!");
                break;
            case 2:
                System.out.println("2 hit!!!");
                break;
            case 3:
                System.out.println("3 hit!!!");
                break;
            case 4:
                System.out.println("4 hit!!!");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("5 - 10 hit");
                break;
            default:
                System.out.println("default hit");
        }



        /*
        * What is an array?
        *   series of data entries sequential in memory
        *
        * arrays are of fixed length
        * */

        //index positions: [0,1,2,3,4]
        //position value:  [1,2,3,4,5]

        int[] arr = {32,76,41,6,9};
        int[] arr2 = new int[99];


        /*
        * java has default values for instance variables and array initializations
        * int is 0, doubles are 0.0D, floats are 0.0F, longs are 0L, byte is 0, char is an empty character
        * */
        for(int arrIndex = 0; arrIndex < arr2.length; ++arrIndex){
            System.out.println(arr2[arrIndex]);

            //arrIndex++ increments the value by 1
        }


        //post pre incrementing example
        /*
        * x++ - runs the statement and then increments
        * ++x - increments first and then runs the statement
        * */

        int x = 2;

        System.out.println(x); //2
        System.out.println(x++); //print 2   x = 3
        System.out.println(++x); //x = 4 before statement


    }
}
