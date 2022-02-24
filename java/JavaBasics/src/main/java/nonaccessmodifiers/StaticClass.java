package nonaccessmodifiers;

public class StaticClass {
    static int staticVar = 0;

    public StaticClass(){
        staticVar = staticVar + 1;
    }

    public static void printHello(){
        System.out.println("YO!");
    }



    // static block. is ran when the StaticBlock class is first ever referenced in memory
    static {

    }
}
