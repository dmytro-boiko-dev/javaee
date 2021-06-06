package hillel.java_vvp.hw_check.j2_hw.hw_eleven.anna_hw;

public class Fitness {
    public static final String RESET = "\033[0m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String BLACK_BOLD = "\033[1;30m";


    private String name;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private String phone;
    private String surname;
    private double weight;
    private String pressure;
    private int numberOfSteps;

    public Fitness(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email,
                   String phone, String surname, double weight, String pressure, int numberOfSteps) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberOfSteps = numberOfSteps;
    }

    public String getName() {
        return name;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public void printAccountInfo() {

        //  1970

        int age = 2020 - yearOfBirth;
        System.out.println(BLACK_BOLD + "---Данные о пользовтеле :" + RESET);
        System.out.println("Имя : " + GREEN_BOLD + getName() + RESET);
        System.out.println("Фамилия : " + GREEN_BOLD + getSurname() + RESET);
        if (monthOfBirth < 10) {
            System.out.print("День рождения : " + GREEN_BOLD + getDayOfBirth() + ".0" + getMonthOfBirth() + "." + getYearOfBirth() + RESET + "\n");
        } else {
            System.out.print("День рождения : " + GREEN_BOLD + getDayOfBirth() + "." + getMonthOfBirth() + "." + getYearOfBirth() + RESET + "\n");
        }
        System.out.println("Email адрес : " + GREEN_BOLD + getEmail() + RESET);
        System.out.println("Номер телефона : " + GREEN_BOLD + getPhone() + RESET);
        System.out.println("Вес : " + GREEN_BOLD + getWeight() + " кг" + RESET);
        System.out.println("Давление : " + GREEN_BOLD + getPressure() + " мм.рт.ст" + RESET);
        System.out.println("Кол-во шагов в день : " + GREEN_BOLD + getNumberOfSteps() + RESET);
        if (age == 1 || age == 21 || age == 31 || age == 41 || age == 51 || age == 61 || age == 71 || age == 81) {
            System.out.println("Пользователю : " + GREEN_BOLD + age + " год" + RESET);
        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            System.out.println("Пользователю : " + GREEN_BOLD + age + " года" + RESET);
        } else {
            System.out.println("Пользователю : " + GREEN_BOLD + age + " лет" + RESET);
        }
    }
}