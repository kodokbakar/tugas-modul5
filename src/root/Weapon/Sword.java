package root.Weapon;

import root.Element;

public class Sword extends Weapon {
    public Sword(Element element) {
        this.element = element;
    }

    @Override
    public void addname(String name){
        this.name = name;
    }
    @Override
    public void setDamage() {
        if (name.equalsIgnoreCase("Silet")){
            this.damage=50;
        }else if (name.equalsIgnoreCase("Clurit")){
            this.damage=70;
        }}
    @Override
    public double getDamage() {
        return damage;
    }
}
