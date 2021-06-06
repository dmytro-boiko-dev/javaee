package hillel.java_vvp.hw_check.j3_hw.hw11.Artem;

public class PersonMain {
    public static void main(String[] args) {
        Person hey = new Person("Artem", "Batyr",
                "artembatyr", 380962803, "Women", "30");
        Person copy = new Person(hey, "Maxim");
        // не понимаю что нужно исправить, чтобы вместо null появлялось имя,
        copy.printParametrsCopyPerson();
        System.out.println("-------------------------------");
        String x = copy.getAge();
        System.out.println(x);
        System.out.println("-------------------------------");

        copy.setGender("Men");
        System.out.println("-------------------------------");


        copy.printParametrsCopyPerson();
    }
}
