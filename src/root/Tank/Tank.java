package root.Tank;

import root.Hero;

public class Tank extends Hero implements Armorable{
    public Armor armor;
    private double healthPoint = 7000;
    private double attackDamage=500;
    private double defense =500;
    protected int level;
    private boolean isDefeated;

    public Tank(int level, Armor armor) {
        this.level = level;
        this.healthPoint += 200*level;
        this.defense += 15*level ;
        this.attackDamage +=20*level;
        this.armor=armor;
    }

    @Override
    public void attack(Hero target) {
        target.reviewDamage(this.attackDamage);
    }
    @Override
    public void reviewDamage(double damage) {
        double realDamage= damage-defense;
        this.healthPoint -= realDamage;
    }
    @Override
    public void spawnIntro(){
        System.out.println("MAJU LO SINI ANJENG!!!");
    }
    @Override
    public void checkStatus() {
        System.out.println("Power Attack = "+ this.attackDamage);
        System.out.println("Level = "+ this.level);
        System.out.println("Health = "+ this.healthPoint);

    }
    @Override
    public void useArmor(Armor a){
    a.setDefensePoint();
    }
    @Override
    public boolean getIsDefeated() {
        return isDefeated;
    }
    @Override
    public void setDefeated() {
        if (healthPoint<=0){
            this.isDefeated=true;
        }else{
            this.isDefeated=false;
        }
    }
}