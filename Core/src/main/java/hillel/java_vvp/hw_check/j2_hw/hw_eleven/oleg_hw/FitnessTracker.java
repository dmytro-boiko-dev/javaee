package hillel.java_vvp.hw_check.j2_hw.hw_eleven.oleg_hw;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FitnessTracker {
    private final String firstName;
    private String secondName;
    private final int year;
    private final int day;
    private final int month;
    private final String email;
    private final String number;
    private double weight;
    private String pressure;
    private int stepsAmount;
    private final String registerDate;
    private final int age;

    public FitnessTracker(String firstName, String secondName, GregorianCalendar birthdayDate, String email, String number, String pressure, double weight, int stepsAmount, String registerDate) throws ParseException {
        this.firstName = firstName;
        this.secondName = secondName;
        this.year = birthdayDate.get(Calendar.YEAR);
        this.day = birthdayDate.get(Calendar.DAY_OF_MONTH);
        this.month = birthdayDate.get(Calendar.MONTH) + 1;
        this.email = email;
        this.number = number;
        this.pressure = pressure;
        this.weight = weight;
        this.stepsAmount = stepsAmount;
        this.registerDate = registerDate;
        SimpleDateFormat formater = new SimpleDateFormat("yyyy");
        Date data = formater.parse(registerDate);
        String str = formater.format(data);
        this.age = Integer.parseInt(str) - birthdayDate.get(Calendar.YEAR);
    }

    public String getFirstName() {
        return firstName;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setStepsAmount(int stepsAmount) {
        this.stepsAmount = stepsAmount;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getStepsAmount() {
        return stepsAmount;
    }

    public int getAge() {
        return age;
    }

    public void printAccount() {
        System.out.println("Имя : " + this.firstName);
        System.out.println("Фамилия : " + this.secondName);
        System.out.println("День рождения : " + this.day);
        System.out.println("Месяц рождения : " + this.month);
        System.out.println("Год рождения : " + this.year);
        System.out.println("Почтовый адрес : " + this.email);
        System.out.println("Номер телефона : " + this.number);
        System.out.println("Давление : " + this.pressure);
        System.out.println("Вес : " + this.weight + " кг");
        System.out.println("Возраст : " + this.age);
        System.out.println("Количество пройденных вами шагов ежедневно : " + this.stepsAmount);
        System.out.println("Дата регистрации : " + this.registerDate);
    }
}