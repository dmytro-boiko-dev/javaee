package excavate;

public class ArraysKlimov {


    public static void main(String[] args) {
        int[][] c = {
                {5,3,7},
                {2,4,6}
        };

//        int[] d = {5,3,7};
//        for(int num : d){
//            System.out.println(num);
//        }

        for(int[] num1 : c){
            for(int num2 : num1){
                    System.out.println(num2);

            }

        }
    }

}