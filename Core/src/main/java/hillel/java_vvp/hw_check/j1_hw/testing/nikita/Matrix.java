package hillel.java_vvp.hw_check.j1_hw.testing.nikita;

public class Matrix {
    public boolean OurMassive(int[][] array, boolean isSquare) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == array[i][j])
                    return true;
            }
        }
        return false;
    }
}
