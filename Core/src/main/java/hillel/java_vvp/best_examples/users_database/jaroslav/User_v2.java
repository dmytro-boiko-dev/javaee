package hillel.java_vvp.best_examples.users_database.jaroslav;

public class User_v2 {
    public int length = 4;
    private String firstName;
    private String secondName;
    private String email;
    private String department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public User_v2(String firstName, String secondName, String email, String department) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.department = department;
    }

    public void printUserInfo(){
        System.out.println("Имя: \t\t\t" + getFirstName());
        System.out.println("Фамилия: \t\t" + getSecondName());
        System.out.println("e-mail: \t\t" + getEmail());
        System.out.println("Департамент: \t" + getDepartment());
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
