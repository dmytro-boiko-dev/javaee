package hillel.java_vvp.hw_check.j3_hw.hw11.Artem;

public class Person {


    private String firstName;
    private String firstName2;
    private String lastName;
    private  String email;
    private int phone;
    private String gender;
    private String age;

    public Person(String firstName, String lastName, String email, int phone,
                  String gender, String age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
    }
    public Person(Person cop, String firstName2) {
        this.firstName = cop.firstName;
        this.firstName = cop.firstName2;
        this.lastName = cop.lastName;
        this.email = cop.email;
        this.phone = cop.phone;
        this.gender = cop.gender;
        this.age = cop.age;
    }

    public String getFirstName() {
        return  this.firstName;
    }
    public String getFirstName2() { return  this.firstName2; }
    public String getLastName() {
        return  this.lastName;
    }
    public String getEmail() {
        return  this.email;
    }
    public int getPhone() {
        return  this.phone;
    }
    public String getGender() {
        return  this.gender;
    }
    public String getAge () {
        if(getGender() == "Men") {
            return this.age;
        }
        else {
            return "Error";
        }
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    public void setAge (String age) {
        this.age = age;
    }
    public void setPhone (int phone) {
        this.phone = phone;
    }
    public void setGender(String gender) {
        System.out.println("Вы не можете изменять пол!!!");
    }

    public void printParametrsCopyPerson() {
        System.out.println(getFirstName2() + " " + getLastName() + " "
        + getEmail() + " " + getPhone() + " " + getGender() + " "
        + getAge());
    }
}
