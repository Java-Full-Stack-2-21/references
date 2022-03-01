package codingchallenges.fightinggame;

public class Shrek extends Fighter{

    public Shrek(String name) {
        super(name);
    }

    @Override
    void special() {
        System.out.println("Shreks special");
    }
}
