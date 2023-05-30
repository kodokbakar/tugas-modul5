package root.Weapon;

import root.Element;

public abstract class Weapon{
    protected String name;
    protected double damage;
    public Element element;

    public void addname(String name){
        this.name = name;
    }

    public void setDamage() {
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }
}