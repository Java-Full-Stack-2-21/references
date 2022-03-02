package piglatin;

public class MainDriver {
    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();
        System.out.println(pigLatin.encrypt("Hi my name is Kevin!"));
    }
}
