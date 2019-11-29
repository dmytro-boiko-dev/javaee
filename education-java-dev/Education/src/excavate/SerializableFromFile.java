package excavate;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableFromFile {
    public static void main(String[] args){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\output.dat"))){

            Person person = (Person) objectInputStream.readObject();
            System.out.printf("Имя: %s \t Возраст: %d \n", person.name, person.age);

        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
