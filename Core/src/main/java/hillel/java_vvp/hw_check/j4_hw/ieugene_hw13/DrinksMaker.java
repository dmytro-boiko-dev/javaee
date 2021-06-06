package hillel.java_vvp.hw_check.j4_hw.ieugene_hw13;

public class DrinksMaker {

    public static double total_cost;
    public static int counter;

                DrinksMaker(){
                    counter++;
            }

    public double PrepareDrink(DrinksMachine drink,double drinks){

        System.out.println("Выбранн напиток: "+drink+" "+drinks+" "+"$");
        return drinks;
    }

    public void CustomerChoice(String s)
    {
        switch (DrinksMachine.valueOf(s)){
            case TEA:
                DrinksMaker.total_cost += PrepareDrink(DrinksMachine.TEA,Drinks.TEA_PRICE);
                break;
            case WATER:
                DrinksMaker.total_cost +=PrepareDrink(DrinksMachine.WATER,Drinks.WATER_PRICE);
                break;
            case COFFEE:
                DrinksMaker.total_cost += PrepareDrink(DrinksMachine.COFFEE,Drinks.COFFEE_PRICE);
                break;
            case MOJITO:
                DrinksMaker.total_cost +=PrepareDrink(DrinksMachine.MOJITO,Drinks.MOJITO_PRICE);
                break;
            case LEMONADE:
                DrinksMaker.total_cost +=PrepareDrink(DrinksMachine.LEMONADE,Drinks.LEMONADE_PRICE);
                break;
            case COCA_COLA:
                DrinksMaker.total_cost +=PrepareDrink(DrinksMachine.COCA_COLA,Drinks.COLA_PRICE);
                break;
            default:
                System.out.println("Выберите напиток!");

        }
    }
}
