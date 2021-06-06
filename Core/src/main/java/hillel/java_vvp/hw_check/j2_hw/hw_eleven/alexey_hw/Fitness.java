package hillel.java_vvp.hw_check.j2_hw.hw_eleven.alexey_hw;


public class Fitness {

    private String name;
    private String email;
    private String phone;
    private int year;
    private int month;
    private int day;

    private String surname;
    private String pressure;
    private double weight;
    private int walk;
    private int age = 2020;

    public String getName() {               // Геттеры для Имени, мэйла, телефона и дня рождения.
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setSurname(String surname) {            // Сеттеры и геттеры для Фамилии, веса, давления и шагов
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setWalk(int walk) {
        this.walk = walk;
    }

    public String getSurname() {
        return surname;
    }

    public String getPressure() {
        return pressure;
    }

    public double getWeight() {
        return weight;
    }

    public int getWalk() {
        return walk;
    }

    public int getAge() {            // Геттер для возраста
        return age;
    }

    public Fitness(String name, String surname, String email, String phone, int year,
                   int month, int day, double weight, String pressure, int walk) {

        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.year = year;
        this.month = month;
        this.day = day;
        this.weight = weight;
        this.pressure = pressure;
        this.walk = walk;

        /*System.out.println("Name: " + name + "; Surname: " + surname + ";");     // Вывод в консоль без вызова метода
        System.out.println("E-mail: " + email);                                    // printAccountInfo()
        System.out.println("Phone number: " + phone);
        System.out.println("Date of birth: " + day + "." + month + "." + year);
        System.out.println("Age: " + (age - year));
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Pressure:" + pressure);
        System.out.println("You have took " + walk + " steps today");
        System.out.println("===================================");
        System.out.println();*/

    }

    /*public void printAccountInfo(){                                       // Метод который в мейне вызывается
                                                                          // командой user0.printAccountInfo();
        System.out.println("Name: " + name + "; Surname: " + surname + ";");
        System.out.println("E-mail: " + email);
        System.out.println("Phone number: " + phone);
        System.out.println("Date of birth: " + day + "." + month + "." + year);
        System.out.println("Age: " + (age - year));
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Pressure:" + pressure);
        System.out.println("You have took " + walk + " steps today");
        System.out.println("===================================");
        System.out.println();
    }*/
}