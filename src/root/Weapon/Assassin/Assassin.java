package root.Weapon.Assassin;

import root.Hero;
import root.Weapon.Weapon;

public class Assassin extends Hero implements CriticalDamage, Weaponable{
    private double healthPoint = 3000;
    private double attackDamage =800;
    private double defense=300;
    protected int level;
    private boolean isDefeated;

    public Assassin(int level) {
        this.level = level;
        this.healthPoint += 90*level;
        this.defense += 15*level ;
        this.attackDamage +=30*level;
        // attackDamage + 40% attackDamage
        attackDamage += attackDamage * ATK_DMG_BONUS;
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
    public void useWeapon(Weapon w) {
        this.attackDamage+=w.getDamage()+w.element.getAdditionalPoint();
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