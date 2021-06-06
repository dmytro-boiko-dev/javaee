package hillel.java_vvp.hw_check.j1_hw.testing;

public class FitnessTracker {
    public static void main(String[] args) {

        Person person1 = new Person("Maks", "Kalinin", "85kg", 120, 8000, 1979,
                3, 4, "makskalinin09@gmail.com", "+380963456789");
        Person person2 = new Person("Kim", "Abdul", "78kg", 126, 5700, 1986,
                7, 2, "abdkim777@ukr.net", "+380659874213");
        Person person3 = new Person("Oleg", "Filenko", "90kg", 130, 3900, 1968,
                9, 10, "filenkoolegggg@gmail.com", "+380967689071");
        person1.printAccountInfo();
        System.out.println("--------------------------------------");
        person2.printAccountInfo();
        System.out.println("--------------------------------------");
        person3.printAccountInfo();
        System.out.println("--------------------------------------");

        person1.setSurname("Andrienko");
        person1.setPressure(110);
        person2.setSteps(18000);
        person2.setWeight("96kg");

        person1.printAccountInfo();
        System.out.println("--------------------------------------");
        person2.printAccountInfo();
    }
}

class Person {

    private String surname;
    private String weight;
    private int pressure;
    private int steps;

    private String name;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    private String mail;
    private String phoneNumber;
    private int age = 2020 - yearOfBirth;

    public Person(String name, String surname, String weight, int pressure, int steps,
                  int yearOfBirth, int monthOfBirth, int dayOfBirth, String mail, String phoneNumber) {
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.mail = mail;
        this.phoneNumber = phoneNumber;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public String getdateOfBirth() {
        return dayOfBirth + "." + monthOfBirth + "." + yearOfBirth;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + pressure);
        System.out.println("Steps: " + steps);
        System.out.println("Date of Birth: " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth);
        System.out.println("Mail: " + mail);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Age: " + age);


    }

}