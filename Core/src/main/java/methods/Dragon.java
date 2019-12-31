package methods;

public class Dragon {
    String name = "Ryu";
    int legs = 4;
    int wings = 2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        if(legs == 4){
            this.legs = legs;
        } else {
            this.legs = 4;
            System.out.println("Number of entered legs: " + legs);
        }
;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {



        if(legs == 2){
            this.wings = wings;
        } else {
            this.legs = 2;
            System.out.println("Number of entered wings: " + wings);
        }
    }
}
