package javateam4.lesson3;

public class Airplane {
    public static void main(String[] args) {

        buildAirplane("Jet", "F52");
        buildAirplane("Boeing", "747", 300);
//        buildAirplane("Boeing", "747", 300, 25);

    }

    public static void buildAirplane(String name, String model){

        String result = "Тип самолета " +  name + ", модель " + model;
        System.out.println(result);
    }

    public static void buildAirplane(String name, String model, int passengers){

        String result = "Тип самолета " +  name + ", модель " + model + ", кол. пасажиров " + passengers;
        System.out.println(result);
    }

}
