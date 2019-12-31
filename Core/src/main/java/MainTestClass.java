import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MainTestClass {
    public static void main(String[] args) {

        int r = (int) (Math.random() * 10);
        System.out.println(r);

        Scanner scanner = new Scanner(System.in);
        int s = 0;
        while (s != r){

            System.out.println("Введите число: ");
            s = scanner.nextInt();

            if(s > r){
                System.out.println("Меньше");
            } else if(s < r){
                System.out.println("Больше");
            }
        }
        System.out.println("Угадали!" + " || " + r + " " + s);


    }
}
