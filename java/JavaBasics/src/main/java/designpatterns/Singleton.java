package designpatterns;
/*
* What is a design pattern?
*   a solution to a common problem in computer science
*
* What is the single design pattern?
*   guarantees only 1 object is ever created
*
* */
public class Singleton {
    private static Singleton obj = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if(obj == null){
            obj = new Singleton();
        }

        return obj;
    }
}
