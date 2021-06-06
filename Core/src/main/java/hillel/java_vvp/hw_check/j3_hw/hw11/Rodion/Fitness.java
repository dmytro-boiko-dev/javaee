package hillel.java_vvp.hw_check.j3_hw.hw11.Rodion;

public class Fitness {
    private final String name;
    private final int ageDay;
    private final int ageMonth;
    private int ageYear;
    private final String email;
    private final String phoneNumber;
    private String surname;
    private int weight;
    private int pressure;
    private int quantityOfSteps;
    private int age;

    public String getName() {
        return name;
    }

    public int getAgeDay() {
        return ageDay;
    }

    public int getAgeMonth() {
        return ageMonth;
    }

    public int getAgeYear() {
        return ageYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getQuantityOfSteps() {
        return quantityOfSteps;
    }

    public int getAge() {
        age = 2021 - this.ageYear;
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setQuantityOfSteps(int quantityOfSteps) {
        this.quantityOfSteps = quantityOfSteps;
    }

    public Fitness(String name, int ageDay, int ageMonth, int ageYear, String email, String phoneNumber, String surname, int weight, int pressure, int quantityOfSteps) {
        this.name = name;
        this.ageDay = ageDay;
        this.ageMonth = ageMonth;
        this.ageYear = ageYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.quantityOfSteps = quantityOfSteps;
        int age = (2021 - ageYear);
    }
    @Override
    public String toString() {
        return "Fitness{" +
                "name='" + name + '\'' +
                ", ageDay=" + ageDay +
                ", ageMonth=" + ageMonth +
                ", ageYear=" + ageYear +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", quantityOfSteps=" + quantityOfSteps +
                ", age=" + age +
                '}';
    }
}
