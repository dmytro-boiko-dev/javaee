package hillel.java_vvp.hw_check.j1_hw.testing.vlad;

public class Matrix2 {
    public int getSquareMatrix(int[][] array, int item) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length == array[i].length) {
                    return 1;
                }

            }

        }
        return 0;
    }
}


