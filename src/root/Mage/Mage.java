package root.Mage;

import root.Hero;

public class Mage extends Hero implements MagicalDamage{
    private double healthPoint =2500;
    private double attackDamage =700;
    private double defense=200;
    protected int level;
    private boolean isDefeated;

    public Mage(int level) {
        this.level = level;
        this.healthPoint += 85*level;
        this.defense += 10*level;
        this.attackDamage +=35*level;
        attackDamage += attackDamage * MAGIC_DMG_BONUS;
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