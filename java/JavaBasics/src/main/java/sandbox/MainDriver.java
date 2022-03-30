package sandbox;

public class MainDriver {

    public static void main(String[] args) { //static scope
        int x = 3;
        int y = 5;
        int z = sum(7, 12);

        String firstAndLastName = combineTwoWords("Kevin", "Childs");

        System.out.println(firstAndLastName);
    }


    //method is a block of reusable
    static int sum(int num1, int num2){
        return num1 + num2;
    }

    static String combineTwoWords(String firstName, String lastName){
        return firstName + lastName;
    }
}
