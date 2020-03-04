package arrays;

public class MultiDimentional {
    public static void main(String[] args) {

        int[][][] array3x = new int[3][3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                        array3x[i][j][k] = 1;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                        System.out.print(array3x[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
