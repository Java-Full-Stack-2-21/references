package codingchallenges.fightinggame;

public class Donkey extends Fighter{

    public Donkey(String name) {
        super(name);
    }

    @Override
    void special() {
        System.out.println("Donkey's special");
    }
}
