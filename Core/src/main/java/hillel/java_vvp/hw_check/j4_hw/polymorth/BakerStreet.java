package hillel.java_vvp.hw_check.j4_hw.polymorth;

public class BakerStreet {
    public static void main(String[] args) {

        // Типы полиморфизма:
        // 1. При создании экземпляра наследника тип данных может быть типа родителя
        // 2. Через родителя можно вызвать любой метод наследников
        // 3. Переопределение

        Baker baker = new Baker("Adam", 86);

        Baker breadBaker = new BreadBaker("John", 35);
        Baker donutBaker = new DonutBaker("Sam", 26);
        Baker pizzeol = new Pizzeol("Mario", 19);

        Baker[] bakers = new Baker[4];
        bakers[0] = baker;
        bakers[1] = breadBaker;
        bakers[2] = donutBaker;
        bakers[3] = pizzeol;

        for (Baker b : bakers){
            b.bake();
        }

        // class Deer extends Animals implements Vegetarians
        /*
            1) Create interface Vegetarians
            2) Create class Animal with method eat()
            3) Create two classes: Bear, Deer(veg), Giraffe(veg)
            4) Override method eat()
            5) In MainClass create bears and deers
            6) Create array of animals and call method eat() for each animal



         */


    }
}
