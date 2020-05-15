package enumeration;

/**
 *  Parameters for the enums possible to use only with constructor
 *  Second constructor used for enum(s) without price
 *  Enums can be compared by equals() and by ==, result will be same
 */

public enum Apple {
    GOLDEN(5), RICHTER(7), SEMERINKA(3), CORTLAND(8), PINKPEARL;
//    GOLDEN, RICHTER, SEMERINKA, CORTLAND;

    private int price;

    Apple(int p){
        price = p;
    }

    Apple(){
        price = -1;
    }

    int getPrice(){
        return price;
    }
}
