package root.Tank;

import root.Element;

public class Armor {
    private double defensePoint=1000;
    private double realDefensePoint;
    private Element element;

    public Armor(Element element) {
        this.element = element;
    }

    public void setDefensePoint() {
        this.defensePoint += defensePoint+element.getAdditionalPoint();
    }

    public double getDefensePoint() {
        return defensePoint;
    }
}
