package hillel.java_vvp.hw_check.j4_hw.jaroslav_hw11;

public class GymOwner {
    private String name;        //this variables is immutable because setters is missing for them and an IDE suggests to make it final
    private String email;
    private String phoneNumber;
    private String surname;
    private String pressure;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private int weight;
    private int stepsCount;
    private int age;

    public GymOwner(
            String name,
            String surname,
            String email,
            String phoneNumber,
            int birthDay,
            int birthMonth,
            int birthYear,
            int weight,
            String pressure,
            int stepsCount
    ) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsCount = stepsCount;
        this.age = 2021- birthYear;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getWeight() {
        return weight;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public String getPressure() {
        return pressure;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String  pressure) {
        this.pressure = pressure;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public void printAccountInfo(){
        System.out.println("-------------------------------------------");
        System.out.println("Посетитель клуба: ");
        System.out.println("ФИО:\t\t\t" + name + " " + surname);
        System.out.println("Дата рождения:\t" + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("Возраст:\t\t" + age + " лет");
        System.out.println("e-mail:\t\t\t" + email);
        System.out.println("Телефон:\t\t" + phoneNumber);
        System.out.println("Вес:\t\t\t" + weight + " кг");
        System.out.println("Давление:\t\t" + pressure);
        System.out.println("Счетчик шагов:\t" + stepsCount + " шагов");
        System.out.println();
    }
}
