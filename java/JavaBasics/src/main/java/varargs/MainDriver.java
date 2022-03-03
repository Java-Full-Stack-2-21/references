package varargs;

public class MainDriver {
    public static void main(String[] args) {
        Calculate calc = new Calculate(1,2,3);

        System.out.println(calc.add(5,7));
        System.out.println(calc.add(7,9,20));
        System.out.println(calc.add(23, 6, 77, 8));


        System.out.println(calc.varArgsAdd("Hello"));
        System.out.println(calc.varArgsAdd("Hi",7,9,20));
        System.out.println(calc.varArgsAdd("Yo",23, 6, 77, 8));
    }
}
