package codingchallenges.wordle;

import codingchallenges.wordle.util.Print;

import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        String wordleWord = "chalk".toUpperCase();

        //convert to char[]

        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 6; i++){
            String guess = "";
            Boolean invalid = true;
            while(invalid) {
                System.out.print("Attempt " + i + ": ");
                guess = scanner.nextLine().toUpperCase();

                invalid = !isValidWord(guess);
            }

            //if character is in correct position
            String result = process(wordleWord, guess);
            if (result.equals("GGGGG")) {
                System.out.println("VICTORY");
                return;
            }

        }

        System.out.println("GAME OVER :(");
    }

    public static String process(String wordle, String guess){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < guess.length(); i++) {
            //check if character is in correct position
            if (charInCorrectIndex(wordle, guess.charAt(i), i)) {
                stringBuilder.append('G');
            }
            //check if character is in incorrect position
            else if (charInIncorrectIndex(wordle, guess.charAt(i))) {
                stringBuilder.append('Y');
            }
            //character is not in word
            else {
                stringBuilder.append('-');
            }
        }

        Print.printGuess(guess, stringBuilder.toString());

        return stringBuilder.toString();
    }

    public static Boolean charInCorrectIndex(String wordle, char character, int index){
        return wordle.charAt(index) == character;
    }

    private static Boolean charInIncorrectIndex(String wordle, char character) {
        //loop through the word and see if character exists
        for(int i = 0; i < wordle.length(); i++){
            if(wordle.charAt(i) == character)
                return true;
        }

        return false;
    }

    public static Boolean isValidWord(String input){
        //more invalid conditions could be added here if needed
        boolean isValid = input.length() == 5;

        if(!isValid)
            System.out.println("Invalid word");

        return isValid;
    }



}
