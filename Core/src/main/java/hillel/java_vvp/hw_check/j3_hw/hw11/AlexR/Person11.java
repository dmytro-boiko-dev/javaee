package hillel.java_vvp.hw_check.j3_hw.hw11.AlexR;

public class Person11 {

    private String firstName;
    private String lastName;
    private String email;
    private long telephone;
    private Boolean gender;
    private int age;

    public Person11(String firstName, String lastName, String email, long telephone, Boolean gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
        this.gender = gender;
        this.age = age;

    }

    public Person11(String firstName,Person11 personWoman) {
        this.firstName = firstName;
        this.lastName = personWoman.lastName;
        this.email = personWoman.email;
        this.telephone = personWoman.telephone;
        this.gender = personWoman.gender;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public Boolean getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void PrintPerson(){
        System.out.println("---------------------");
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Telephone number: " + telephone);

        if (gender == true){
            System.out.println("Gender: man");
            System.out.println("Age: " + age);
        }else{
            System.out.println("Gender: woman");
            System.out.println("Woman don't have age ");

        }

    }
}


