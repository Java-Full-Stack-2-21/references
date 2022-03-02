package piglatin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
* What is junit?
*   it is a testing framework for java
*
* What is unit testing?
*   testing the smallest pieces of code in your program.
*   - in java the smallest pieces we can test are methods
*
* What is an annotation?
*   annotations add metadata to entities in java to
*   give more information about that entity
*
* What are some of the annotations in junit?
*   - @Test: marks a method as a test case
*   - @BeforeAll: this will run before the entire test suite is ran
*   - @BeforeEach: this will run before an individual test is ran
*   - @AfterAll: this will run after the entire test suite is ran
*   - @AfterEach: this will run after each individual test case.
* */
class PigLatinTest {

    PigLatin pigLatin;

    public PigLatinTest(){
        pigLatin = new PigLatin();
    }

    /*@BeforeAll
    static void beforeAll(){
        System.out.println("before all method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("before each method");
    }*/

    @Test
    void encryptWithValidSentence() {
        //arrange - where we do the setup for our test
        String initialSentence = "Hello my name is Kevin";
        String expectedOutput = "elloHay ymay amenay siay evinKay";


        //act - where we call the method with the initial sentence
        String actualOutput = pigLatin.encrypt(initialSentence);

        //assert - pass or fail condition goes here
        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void encryptWithInvalidSentence(){

    }
}