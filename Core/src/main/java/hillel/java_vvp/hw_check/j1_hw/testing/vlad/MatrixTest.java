package hillel.java_vvp.hw_check.j1_hw.testing.vlad;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixTest {
    Matrix2 matrix2;

    @Before
    public void beforeTest() {
        matrix2 = new Matrix2();
    }

    @Test
    public void getSquareMatrixTest1() {
        int[][] arrayTest = new int[4][5];

        int result = matrix2.getSquareMatrix(arrayTest, 100);
        Assert.assertEquals(1, result);
    }

    @Test
    public void getSquareMatrixTest2() {
        int[][] arrayTest = new int[3][3];

        int result = matrix2.getSquareMatrix(arrayTest, 100);
        Assert.assertEquals(1, result);
    }

    @Test
    public void getSquareMatrixTest3() {
        int[][] arrayTest = new int[8][6];

        int result = matrix2.getSquareMatrix(arrayTest, 100);
        Assert.assertEquals(1, result);
    }

    /*Почему этот вариант пропускает как квадратную матрицу,
     когда количество элементов не соответствует квадратной матрице?
     Тоесть квадрат это 3*3 = 9 элементов в массиве, а их по факту 8
     */
    @Test
    public void getSquareMatrixTest4() {
        int[][] arrayTest = {
                {2, 5, 6},
                {5, 8},
                {9, 0, 2}
        };

        int result = matrix2.getSquareMatrix(arrayTest, 100);
        Assert.assertEquals(1, result);
    }
}
