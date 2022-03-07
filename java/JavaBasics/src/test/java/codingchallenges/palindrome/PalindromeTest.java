package codingchallenges.palindrome;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    Palindrome pal = new Palindrome();

    @Test
    void isPalindromeValidPalindrome() {
        //arrange - the setup
        String wordToBePassed = "racecar";
        Boolean expectedResult = true;

        //act - actually calling the method we are testing
        Boolean actualResult = pal.isPalindrome(wordToBePassed);

        //assert - comparing the actual result with the expected
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void isPalindromeInvalidPalindrome() {
        //arrange
        String wordToBePassed = "Donneice";

        //act
        Boolean actualResult = pal.isPalindrome(wordToBePassed);

        //assert
        Assertions.assertFalse(actualResult);
    }
}