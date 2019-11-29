package collections;

import java.io.*;

public class SerializableExmpl {
    public static void main(String[] args) throws Exception{
        SerializableUser serializableUser = new SerializableUser();


        FileOutputStream fileOutputStream = new FileOutputStream("testOutputFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(serializableUser);
        objectOutputStream.close();

        // now object is saved to the "testOutputFile" file
        // next - we should read information from

        FileInputStream fileInputStream = new FileInputStream("testOutputFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializableUser serializableUser1 = (SerializableUser) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(serializableUser1.a);
        System.out.println(serializableUser1.node);

    }
}
