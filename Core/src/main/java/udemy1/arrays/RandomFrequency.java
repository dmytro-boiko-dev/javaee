package udemy1.arrays;

import java.security.SecureRandom;

public class RandomFrequency {
    public static void main(String... args) {

//        SecureRandom random = new SecureRandom();
//        int[] frequency = new int[7];
//        for (int i = 0; i < 1000; i++) {
//            ++frequency[1 + random.nextInt(6)];
//        }

//        for (int i = 1; i < frequency.length; i++) {
//            System.out.println(frequency[i]);
//        }

        getArrayValues();
        System.out.println("------------------");
        setArrayValues();
    }

    private static void getArrayValues(){
        int[][] array = {{1,3},{5,2,14},{8,1,5,4},{3,2,1}};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void setArrayValues(){
        int[][] a = new int[5][5];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){

                SecureRandom random = new SecureRandom();
                int r = random.nextInt(9);    // create random number from 0 to 8
                a[i][j] = r;                         // write random number to the 'j' element of 'i' array
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }


}
