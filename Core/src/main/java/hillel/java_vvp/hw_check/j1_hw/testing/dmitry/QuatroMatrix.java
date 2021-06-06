package hillel.java_vvp.hw_check.j1_hw.testing.dmitry;

public class QuatroMatrix {

    public int matrix(int[][] arr, int a) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length == arr[i].length) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public int matrix2(int[][] array, int b) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + j) + 1;
                if (array[i][j] < array[i][j] + 1) {
                    return 2;
                }
            }
        }
        return -2;
    }
}
