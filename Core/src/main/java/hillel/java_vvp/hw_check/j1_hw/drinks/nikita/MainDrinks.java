package hillel.java_vvp.hw_check.j1_hw.drinks.nikita;


import java.util.Scanner;

public class MainDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, выберите напиток,который вы хотите заказать ,писать с большой буквы :");
        System.out.println("У нас есть : чай, кофе, лимонад, вода, мохито, кока-кола");
        String drink = scanner.nextLine();
        switch (drink) {
            case "Мохито":
                MakeDrinks makeDrinks = new MakeDrinks();
                makeDrinks.MakeMojito();
                break;
            case "Вода":
                MakeDrinks makeDrinks2 = new MakeDrinks();
                makeDrinks2.MakeWater();
                break;
            case "Чай":
                MakeDrinks makeDrinks3 = new MakeDrinks();
                makeDrinks3.MakeTea();
                break;
            case "Кола-кола":
                MakeDrinks makeDrinks4 = new MakeDrinks();
                makeDrinks4.MakeCocaCola();
                break;
            case "Кофе":
                MakeDrinks makeDrinks5 = new MakeDrinks();
                makeDrinks5.MakeCoffee();
                break;
            case "Лимонад":
                MakeDrinks makeDrinks6 = new MakeDrinks();
                makeDrinks6.MakeLemonade();
                break;
            default:
                System.out.println("Напишите напиток который вы хотите правильно ,писать надо с большой буквы ");

        }


    }


}

