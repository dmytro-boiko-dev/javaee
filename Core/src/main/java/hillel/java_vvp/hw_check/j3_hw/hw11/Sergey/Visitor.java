package hillel.java_vvp.hw_check.j3_hw.hw11.Sergey;

public class Visitor {
    private String name;
    private String familyName;
    private String email;
    private String telephone;
    private String bloodPressure;
    private double bodyWeight;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private int dailySteps;
    private int age;

    public Visitor(String name, String familyName, String email, String telephone, String bloodPressure,
                   double bodyWeight,
                   int birthDay, int birthMonth, int birthYear, int dailySteps) {
        this.name = name;
        this.familyName = familyName;
        this.email = email;
        this.telephone = telephone;
        this.bloodPressure = bloodPressure;
        this.bodyWeight = bodyWeight;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.dailySteps = dailySteps;
        age = 2020 - birthYear;
    }

    public Visitor(Visitor v) {
        this.name = v.getName();
        this.familyName = v.getFamilyName();
        this.email = v.getEmail();
        this.telephone = v.getTelephone();
        this.bloodPressure = v.getBloodPressure();
        this.bodyWeight = v.getBodyWeight();
        this.birthDay = v.getBirthDay();
        this.birthMonth = v.getBirthMonth();
        this.birthYear = v.getBirthYear();
        this.dailySteps = v.getDailySteps();
        age = v.getAge();
    }

    public String getName() {
        return name;
    }
    public String getFamilyName() {
        return familyName;
    }
    public String getEmail() {
        return email;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getBloodPressure() {
        return bloodPressure;
    }
    public double getBodyWeight() {
        return bodyWeight;
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
    public int getDailySteps() {
        return dailySteps;
    }
    public int getAge() {
        return age;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }
    public void setDailySteps(int dailySteps) {
        this.dailySteps = dailySteps;
    }

    public void getAccountInfo() {
        System.out.println("===========Visitor's INFO================");
        System.out.printf("%-20s%s\n","Name:", name);
        System.out.printf("%-20s%s\n","Surname:", familyName);
        System.out.printf("%-20s%s\n","E-mail:", email);
        System.out.printf("%-20s%s\n","Phone:", telephone);
        System.out.printf("%-20s%s\n","Blood Pressure:", bloodPressure);
        System.out.printf("%-20s%s kg\n","Body Weight:", bodyWeight);
        System.out.printf("%-20s%s/%s/%s\n","Born:", birthDay, birthMonth, birthYear);
        System.out.printf("%-20s%s\n","Daily steps, avg:", dailySteps);
        System.out.printf("%-20s%s y.o.\n","Age:", age);

    }
}
