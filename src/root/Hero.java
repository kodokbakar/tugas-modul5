package root;

public abstract class Hero {
    private double healthPoint;
    private double attackDamage;
    private double defense;
    protected int level;
    private boolean isDefeated;

    public void attack(Hero target) {
    target.reviewDamage(this.attackDamage);
    }

    public void reviewDamage(double damage) {
    double realDamage= damage-defense;
    this.healthPoint -= realDamage;
    }

    public abstract void spawnIntro();

    public void checkStatus() {
        System.out.println("Power Attack = "+ this.attackDamage);
        System.out.println("Level = "+ this.level);
        System.out.println("Health = "+ this.healthPoint);

    }

    public boolean getIsDefeated() {
        return isDefeated;
    }

    public void setDefeated() {
        this.isDefeated= healthPoint <= 0;
    }
}