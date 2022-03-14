package lambdas;

public class FunctionalInterfaceImpl implements FunctionalInterface{
    @Override
    public String isEvenOrOdd(String word, Integer num){

        if(word.length() % 2 == 0) {
            return "EVEN";
        }


        return "ODD";


        //return word.length() % 2 == 0 ? "EVEN" : "ODD";

    }

}
