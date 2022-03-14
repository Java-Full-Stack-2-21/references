package lambdas;

public class MainDriver {
    public static void main(String[] args) {
        /*FunctionalInterface func = new FunctionalInterfaceImpl();
        System.out.println(func.isEvenOrOdd("Kevin"));*/

        /*FunctionalInterface func = new FunctionalInterface() {
            @Override
            public String isEvenOrOdd(String word) {
                return word.length() % 2 == 0 ? "EVEN" : "ODD";
            }
        };
        System.out.println(func.isEvenOrOdd("Fork"));
*/

        //lambdas are sugar syntax for the implementation above.
        FunctionalInterface func = (word, num) -> {
            return word.length() % 2 == 0 ? "EVEN" : "ODD";
        };


        FunctionalInterface f = (word, num) -> word.length() % 2 == 0 ? "EVEN" : "ODD";


        FunctionalInterfaceImpl fii = new FunctionalInterfaceImpl();

        FunctionalInterface f3 = fii::isEvenOrOdd;
    }
}
