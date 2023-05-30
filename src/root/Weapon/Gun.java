package root.Weapon;

import root.Element;

public class Gun extends Weapon {
  public Gun(Element element) {
    this.element = element;
  }

  @Override
  public void addname(String name){
    this.name = name;
  }
  @Override
  public void setDamage() {
    if (name.equalsIgnoreCase("Glock 19")){
      this.damage=80;
    }else if (name.equalsIgnoreCase("AK47")){
      this.damage=100;
    }}
  @Override
  public double getDamage() {
    return damage;
  }
}
