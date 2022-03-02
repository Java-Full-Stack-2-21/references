package piglatin;

public class PigLatin {
    public String encrypt(String sentence){
        //check if its a valid sentence
        if(!isValidSentence(sentence)){
            return "invalid sentence";
        }


        //split the sentence into a words array


        //convert each word to pig latin

        //bring the string array back into a string that we can return

        return null;
    }

    public boolean isValidSentence(String sentence) {
        String[] words = sentence.split(" ");
        Boolean isValid = true;

        for(String word : words){
            for(int c = 0; c < word.length(); c++){
                if(!Character.isLetter(word.charAt(c))){
                    isValid = false;
                }
            }
        }

        return isValid;
    }
}
