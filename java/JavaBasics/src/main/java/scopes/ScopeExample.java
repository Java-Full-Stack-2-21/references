package scopes;


/*
* What is scope?
*   scope is where a variable can be seen within a class
*
* 4 scopes in java:
* - class/static scope - you cannot access any variables in the below scopes.
* - object/instance scope - can access static scope can also access instance scope
* - method scope - can access object and static scope
* - block scope - can access any of the above
*
* */
public class ScopeExample {
    static int staticVar = 1; //static scope
    int instanceVar = 2; //instance scope

    static void staticMethod(){
        /*
        * What variables can I see here?
        *   - staticVar
        * */

    }

    void instanceMethod(){ //instance scope
        /*
        * What variables can I see here?
        *  - instanceVar
        *  - staticVar
        * */

        int methodVar = 3; //method scope

        if(true) {
            int blockVar = 4; //block scope
            if (true) {
                int x = 2;
            }

        }


    }

}
