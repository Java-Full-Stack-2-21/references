package codingchallenges.fightinggame;

import sandbox.Random;

public class Arena {

    public void fight(Fighter one, Fighter two) throws InterruptedException {
        Boolean fighting = true;
        Integer round = 1;

        while(fighting){
            System.out.println("ROUND " + round++);

            Boolean isAlive = true;

            switch (Random.wholeNumber(1,2)){
                case 1:
                    isAlive = one.attack(two);
                    break;
                case 2:
                    isAlive = two.attack(one);
                    break;
            }

            if(!isAlive)
                fighting = false;


            System.out.println();
            Thread.sleep(2000);


        }



    }
}
