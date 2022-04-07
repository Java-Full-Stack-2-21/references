package codingchallenges.fizzbuzz;

public class FizzBuzz {
    public static String calculate(Integer n){

        StringBuilder result = new StringBuilder();
        //iterate from 1 to n
        for(int i = 1; i <= n; i++){
            //if divisible by 3, append Fizz
            if(i % 3 == 0) result.append("Fizz");

            //if divisible by 5, append Buzz
            if(i % 5 == 0) result.append("Buzz");

            //if neither, append number
            if(i % 3 != 0 && i % 5 != 0) result.append(i);

            result.append(", ");
        }

        //remove the last comma and space and then return the result
        return result.delete(result.length() - 2, result.length()).toString();
    }
}
