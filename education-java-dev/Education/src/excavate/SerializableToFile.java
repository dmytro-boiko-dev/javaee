package excavate;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableToFile {

    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(new FileOutputStream("D:\\output.dat")))
        {
            Person person = new Person("Jhon", 33, 175.0,true);
            objectOutputStream.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class Person implements Serializable{

    public String name;
    public int age;
    public double height;
    public boolean married;

    //constructor
    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

}
