package hillel.java_vvp.hw_check.j4_hw.jaroslav_hw11;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class GymOwner_v3 {
    private String name;
    private String email;
    private String phoneNumber;
    private String surname;
    private String pressure;
    private String birthDate;
    private String weight;
    private String stepsCount;

    public GymOwner_v3(
            String name,
            String surname,
            String email,
            String phoneNumber,
            String birthDate,
            String weight,
            String pressure,
            String stepsCount
    ) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsCount = stepsCount;

    }

    public String getName() {
        return name;
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

    public String getPressure() {
        return pressure;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getWeight() {
        return weight;
    }

    public String getStepsCount() {
        return stepsCount;
    }



    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setStepsCount(String stepsCount) {
        this.stepsCount = stepsCount;
    }


    public int calculatingAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate startDate = LocalDate.parse(birthDate, formatter);
        LocalDate endDate = LocalDate.now();
        Period period = Period.between(startDate, endDate);
        return period.getYears();
    }



}
