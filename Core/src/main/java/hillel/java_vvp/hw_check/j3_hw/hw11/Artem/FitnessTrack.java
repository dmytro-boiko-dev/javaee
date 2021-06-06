package hillel.java_vvp.hw_check.j3_hw.hw11.Artem;

public class FitnessTrack {

    private String name;
    private int dayBirthday;
    private int monthBirthday;
    private int yearBirthday;
    private String email;
    private int telNumber;
    private String surName;
    private double weight;
    private int pressure;
    private int steps;
    private int age;

    public FitnessTrack(String name, int dayBirthday, int monthBirthday, int yearBirthday,
                        String email, int telNumber, String surName, double weight,
                        int pressure, int steps) {
        this.name = name;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.email = email;
        this.telNumber = telNumber;
        this.surName = surName;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    public String getName() {
        return this.name;
    }
    public int getDayBirthday() {
        return  this.dayBirthday;
    }
    public int getMonthBirthday() {
        return  this.monthBirthday;
    }
    public int getYearBirthday() {
        return  this.yearBirthday;
    }
    public String getEmail() {
        return this.email;
    }
    public int getTelNumber() {
        return this.telNumber;
    }
    public int getAge() {
        return 2020 - getYearBirthday();
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public void setWeight(double weight) {
        if(weight < 300) {
            this.weight = weight;
        }
        else {
            System.out.println("Ошибка, вес неверный!!!!!!!!!!!");
        }
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println("name : " + getName() + "\nDateOfBirthday: "
                + getDayBirthday() + "." +
                getMonthBirthday() + "." + getYearBirthday() + "\nemail: "
                + getEmail() + "\nTelNumber: " +
                getTelNumber() + "\nSurname: " + this.surName + "\nWeight: "
                + this.weight + "\nPressure: " +
                this.pressure + "\nSteps: " + this.steps + "\nAge: " + getAge());
    }


}
