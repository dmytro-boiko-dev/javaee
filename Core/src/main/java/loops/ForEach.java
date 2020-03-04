package loops;

public class ForEach {
    public static void main(String[] args) {

        int[][] array = new int[3][6];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = (i+1) * (j+1);
            }
        }

        // using foreach for double arrays
        for (int[] arr : array){
            for (int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
