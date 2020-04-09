import java.util.Arrays;
import java.util.Scanner;

public class MainTestClass {
    public static void main(String[] args) {

        int[] comp = {2, 5, 1, 8, 4, 9, 4};
        int[] uch =  {9, 1, 3, 8, 2, 1, 2};


        int[] comp1 = comp.clone();
        Arrays.sort(comp1);

        System.out.print("Отсортированные числа компании:  ");

        for (int i = 0; i < comp1.length - 1; i++) {


            System.out.print(comp1[i] + ", ");

        }


        System.out.println(comp1[comp1.length - 1] + ".");

        System.out.print("Отсортированные числа участника: ");


        int[] uch1 = uch.clone();
        Arrays.sort(uch1);


        for (int i = 0; i < uch1.length - 1; i++) {


            System.out.print(uch1[i] + ", ");

        }


        System.out.println(uch1[uch1.length - 1] + ".");

        System.out.print("Совпали числа ");


        for (int i = 0; i < comp1.length; i++) {

            if (comp1[i]==uch1[i]){

                System.out.print(i + "-oe, ");
            }

        }
        System.out.println(" при  учёте, что первые числа массивов имеют порядковое значение 0.");

    }

}