package codingchallenges.fightinggame;

import sandbox.Random;

public abstract class Fighter {

    private String name;
    private Integer health;

    public Fighter(String name){
        this.name = name;
        this.health = 100;
    }

    public Boolean attack(Fighter fighter){
        Integer randomDamageTaken = Random.wholeNumber(1,30);
        Integer enemyHealthLeft = fighter.takeDamage(randomDamageTaken);
        if(enemyHealthLeft <= 0){
            System.out.println(this.getName() + " hit the final blow with " + randomDamageTaken + " and is victorious!!!");
        }else {
            System.out.println(this.getName() + " hit " + fighter.getName() + " for " + randomDamageTaken + " and has " + fighter.getHealth() + " health left");
        }

        return enemyHealthLeft > 0;

    }

    public Integer takeDamage(Integer damageTaken){
        this.health = this.health - damageTaken;
        return this.health;
    }

    abstract void special();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }
}
