import java.util.Arrays;

public class MainTestClass {

    public static void main(String[] args) {

        String str = "Hello World how are you today ?";

        String intern = str.intern();
        System.out.println(intern);

//        String[] strArray = str.split(" ");
//        System.out.println(Arrays.toString(strArray));
//
//        for(String oneWord : strArray){
//            System.out.println(oneWord);
//        }

    }
}
