package root;

public class Element {
   private String name[]={"Gheni", "Banyu", "Lemah"};
   private double additionalPoint;


   public void setAdditionalPoint(String name) {
    if (name.equalsIgnoreCase(this.name[0])){
       this.additionalPoint=50;
    }else if (name.equalsIgnoreCase(this.name[1])){
       this.additionalPoint= 70;
    }else if (name.equalsIgnoreCase(this.name[2])){
       this.additionalPoint=80;
    }
   }

   public double getAdditionalPoint() {
      return additionalPoint;
   }

    public String[] getName() {
       return name;
    }
}