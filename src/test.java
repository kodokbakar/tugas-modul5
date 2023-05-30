import root.Element;
import root.Weapon.Assassin.Assassin;
import root.Weapon.Gun;
import root.Weapon.Weapon;

public class test {
    public static void main(String[] args) {
        Assassin h;
        Element e = new Element();
        Weapon w;
        h = new Assassin(5);
        h.checkStatus();
        //1120
        w = new Gun(e);
        w.addname("AK47");
        w.setDamage();
        System.out.println(w.getDamage());
        e.setAdditionalPoint("Banyu");
        System.out.println("=");
        h.checkStatus();
        System.out.println("=");
        h.useWeapon(w);
        h.checkStatus();
        System.out.println("=");
    }
}
