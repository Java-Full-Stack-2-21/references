package codingchallenges.wordle.util;

public class Print {

    public static void printGuess(String guess, String result){


        for(int i = 0; i < guess.length(); i++)
            System.out.print(guess.charAt(i) + " | ");
        System.out.println();

        for(int i = 0; i < guess.length(); i++)
            System.out.print(result.charAt(i) + " | ");
        System.out.println();
    }
}
