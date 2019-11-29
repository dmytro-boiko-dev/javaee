package excavate;

import java.io.Serializable;

public class SerialVersionTest implements Serializable {

    private static final long serialVersionUID = 132112323L;

    public static void main(String[] args) {
        System.out.println("It works!");
        System.out.println(serialVersionUID);
    }
}
