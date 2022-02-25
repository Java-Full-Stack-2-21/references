package codingchallenges.evenorodd;

public class MainDriver {

    public static void main(String[] args) {

        evenOrOdd(183);
        evenOrOdd(123);
        evenOrOdd(142);
    }


    static void evenOrOdd(int num){
        if(num % 2 == 0){
            System.out.println("EVEN!!!");
        }else{
            System.out.println("ODD!!!");
        }


        //String result = num % 2 == 0 ? "EVEN!!!" : "ODD!!!";

        //System.out.println(result);


    }

}
