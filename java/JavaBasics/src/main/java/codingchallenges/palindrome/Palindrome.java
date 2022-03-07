package codingchallenges.palindrome;

public class Palindrome {

    public Boolean isPalindrome(String word){
        String lowercase = word.toLowerCase();
        String reversed = new StringBuilder(lowercase).reverse().toString();

        return lowercase.equals(reversed);
    }

    public Boolean isPalindrome2(String word){
        String lowercase = word.toLowerCase();

        for(int i = 0; i < word.length() / 2; i++) {
            if (lowercase.charAt(0) != lowercase.charAt(word.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}
