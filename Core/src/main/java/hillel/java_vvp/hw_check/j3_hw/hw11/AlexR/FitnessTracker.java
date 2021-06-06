package hillel.java_vvp.hw_check.j3_hw.hw11.AlexR;

public class FitnessTracker {
    private String name;
    private String Surname;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String email;
    private long number;
    private double weight;
    private int systolicPressure;
    private int diastolicPressure;
    private int steps;
    private int age;




    public FitnessTracker(String name, String surname, int dayOfBirth, int monthOfBirth, int yearOfBirth, String email, long number, double weight, int systolicPressure, int diastolicPressure, int steps) {
        this.name = name;
        Surname = surname;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.number = number;
        this.weight = weight;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.steps = steps;

    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return Surname;
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
    public long getNumber() {
        return number;
    }
    public double getWeight() {
        return weight;
    }
    public int getSystolicPressure() {
        return systolicPressure;
    }
    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }
    public int getDiastolicPressure() {
        return diastolicPressure;
    }
    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }
    public int getSteps() {
        return steps;
    }
    public int getAge() {
        return age;
    }
    public void setSurname(String surname) {
        Surname = surname;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printAccountInfo(){
        System.out.println("___________________________");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + Surname);
        if (dayOfBirth >=1 && dayOfBirth <=31 && monthOfBirth >=1 && monthOfBirth <=12 && yearOfBirth >1900 && yearOfBirth <=2021 ){
            System.out.println("Date of Birth: " + dayOfBirth + "."
                    + monthOfBirth + "." + yearOfBirth);
        }else{
            System.out.println("Please, enter correct date of Birth");
        }
        System.out.println("Email: " + email);
        System.out.println("Number: " + number);
        if (weight >0){
        System.out.println("Weight: " + weight);
        }else {
            System.out.println("Please, enter correct weight");
        }
        System.out.println("Pressure: " + systolicPressure + "/" + diastolicPressure);
        if(steps > 1) {
            System.out.println("Steps: " + steps);
        }else{
            System.out.println("Incorrect count of steps");
        }
        if (monthOfBirth <=2) {
            age = 2021 - yearOfBirth;
            System.out.println("Age: " + age);
        }else {
            age = 2020 - yearOfBirth;
            System.out.println("Age: " + age);
        }

    }
}
