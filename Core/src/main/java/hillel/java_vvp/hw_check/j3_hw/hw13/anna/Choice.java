package hillel.java_vvp.hw_check.j3_hw.hw13.anna;
import java.util.Scanner;

public class Choice extends Drinks {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";
    static int counter = 1;
    static double[] value = new double[counter+2];
    static double fullValue = 0;
    static DrinksMachine[] choices = new DrinksMachine[counter+2];
    static int[] amounts = new int[counter+2];

    public static void main(String[] args) throws InterruptedException{
        System.out.println(ANSI_BLUE + "                Vending machine can make you a drink" + ANSI_RESET);

        System.out.println("Do you want to order something?" + ANSI_PURPLE + " (Yes/No)" + ANSI_RESET);

        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        int count = 0;
        for (int k = 0; k < answer.length(); k++) {
            count++;
        }
        int m = 0;
        for (int i = 0; i < counter; i++) {
            if (count == 3) {
                System.out.println("Choose your drink: " + "\n"
                        + "Coffee, tea, lemonade, mojito, mineral_water, coca_cola");
                Scanner sc2 = new Scanner(System.in);
                String choice = sc2.nextLine();
                choice = choice.toUpperCase();
                DrinksMachine drinks = DrinksMachine.valueOf(choice);
                System.out.println("-------------------------------------------------------");

                Thread.sleep(500);

                switch (drinks) {
                    case COFFEE:
                        drinks.makeDrinks(choice);
                        System.out.println("Cup of coffee costs " + COFFEEPRICE + "$");
                        break;
                    case TEA:
                        drinks.makeDrinks(choice);
                        System.out.println("Cup of tea costs " +  TEAPRICE + "$");
                        break;
                    case LEMONADE:
                        drinks.makeDrinks(choice);
                        System.out.println("Glass of lemonade costs " +  LEMONADEPRICE + "$");
                        break;
                    case MOJITO:
                        drinks.makeDrinks(choice);
                        System.out.println("Glass of mojito costs " +  MOJITOPRICE + "$");
                        break;
                    case MINERAL_WATER:
                        drinks.makeDrinks(choice);
                        System.out.println("Bottle of mineral water costs " +  WATERPRICE + "$");
                        break;
                    case COCA_COLA:
                        drinks.makeDrinks(choice);
                        System.out.println("Bottle of coca-cola costs " +  COLAPRICE + "$");
                        break;
                    default:
                        System.out.println("Error!");
                }

                Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter the amount of drinks: ");
                int amount = sc3.nextInt();
                amounts[i] = amount;

                Thread.sleep(500);

                if(amount > 1){
                    System.out.println("You ordered " + amount + " " + choice +"S");
                }else{
                    System.out.println("You ordered " + amount + " " + choice);
                }

                switch (drinks) {
                    case COFFEE:
                        choices[m] = drinks;
                        value[m] = amount * COFFEEPRICE;
                        break;
                    case TEA:
                        choices[m] = drinks;
                        value[m] = amount * TEAPRICE;
                        break;
                    case LEMONADE:
                        choices[m] = drinks;
                        value[m] = amount * LEMONADEPRICE;
                        break;
                    case MOJITO:
                        choices[m] = drinks;
                        value[m] = amount * MOJITOPRICE;
                        break;
                    case MINERAL_WATER:
                        choices[m] = drinks;
                        value[m] = amount * WATERPRICE;
                        break;
                    case COCA_COLA:
                        choices[m] = drinks;
                        value[m] = amount * COLAPRICE;
                        break;
                    default:
                        System.out.println("Error!");
                }
                System.out.println();
                System.out.println("Do you want to order something else?" + ANSI_PURPLE + " (Yes/No)" + ANSI_RESET);
                String answer2 = sc.nextLine();

                count = 0;
                for (int j = 0; j < answer2.length(); j++) {
                    count++;
                }
                if (count == 3) {
                    counter++;
                    m++;

                } else if (count == 2) {
                    System.out.println(ANSI_BLUE + "    Your order: " + ANSI_RESET);

                    for (int j = 0; j < counter; j++) {
                        if(i > 0){
                        System.out.println(amounts[j] + " " + choices[j] + ": " + roundAvoid(value[j],2) + "$");
                         fullValue = fullValue + value[j];
                        }else{
                            System.out.println(amount + " " + choice + ": " + roundAvoid(value[i],2) + "$");
                            fullValue = fullValue + value[j];

                        }
                    }
                    System.out.println(ANSI_BLUE + "Full price is: " + ANSI_RESET + roundAvoid(fullValue,2) + "$");
                }else{
                    System.out.println("Wrong answer.");
                }

            } else {
                System.out.println("Try again");
            }
        }
    }
}
