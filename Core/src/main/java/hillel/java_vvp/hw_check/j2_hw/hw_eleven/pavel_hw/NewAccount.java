package hillel.java_vvp.hw_check.j2_hw.hw_eleven.pavel_hw;


public class NewAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String numberPhone;
    private double weight;
    private double pressure;
    private int steps;
    private int age;

    public NewAccount(String firstName, String lastName, int birthday, int monthOfBirth, int yearOfBirth, String email, String numberPhone,
                      double weight, double pressure, int steps) {

        this.age = 2020 - yearOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = birthday + "|" + monthOfBirth + "|" + yearOfBirth; // принимает по отдельности дату/месяц/год и приводим все к строке
        this.email = email;
        this.numberPhone = numberPhone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public double getWeight() {
        return weight;
    }

    public double getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        return age;
    }
}
