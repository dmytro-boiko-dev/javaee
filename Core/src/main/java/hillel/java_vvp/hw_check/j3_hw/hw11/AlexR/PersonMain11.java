package hillel.java_vvp.hw_check.j3_hw.hw11.AlexR;

public class PersonMain11 {
    public static void main(String[] args) {
        Person11 personMan = new Person11("Alex", "Rozhkovan", "isnickey@gmail.com",
                380932332984L, true, 23 );
        Person11 personWoman = new Person11("Julia", "Belaya", "yuBelaya@gmail.com",
                380952525225L, false, 21 );

        Person11 copyPersonWoman = new Person11("Lina",personWoman);

        personMan.PrintPerson();
        personWoman.PrintPerson();
        copyPersonWoman.PrintPerson();


    }



}
