package codingchallenges.fightinggame;

public class MainDriver {
    public static void main(String[] args) throws InterruptedException {
        Fighter fighter1 = new Shrek("Flo");
        Fighter fighter2 = new Donkey("Kevin");

        Arena arena = new Arena();
        arena.fight(fighter1, fighter2);

    }
}
