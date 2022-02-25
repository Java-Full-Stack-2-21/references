package scopes;

public class MainDriver {
    public static void main(String[] args) {
        //ScopeExample se = new ScopeExample();

        /*
         * What is casting?
         *   trying to convert one datatype to another
         *
         * If you need to explicitly cast, the syntax is ([datatype to cast to]) before the variable
         * */

        int x = 2;
        double y = x; // widening

        double z = 3.745345;
        int i = (int) z; //narrowing

        //float f = 3.14;
        int test = 257;
        byte b = (byte) test;



        System.out.println(b);
    }
}
