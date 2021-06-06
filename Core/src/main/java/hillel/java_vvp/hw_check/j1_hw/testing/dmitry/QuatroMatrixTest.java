package hillel.java_vvp.hw_check.j1_hw.testing.dmitry;

import org.junit.Assert;
import org.junit.Test;

public class QuatroMatrixTest {

    int c = (int) (2 + Math.random() * 5);
    int b = (int) (2 + Math.random() * 5);

    @Test
    public void test() {
//        System.out.println("Число 1 = " + c + "; " + "число 2 = " + b);
        int[][] arrayTest = new int[5][5];
        QuatroMatrix matrix = new QuatroMatrix();
        int result = matrix.matrix(arrayTest, 6);
        Assert.assertEquals(1, result);

    }

    @Test
    public void test2() {

        int[][] arrayTest2 = new int[c][b];
        QuatroMatrix matrix2 = new QuatroMatrix();
        int result2 = matrix2.matrix2(arrayTest2, 4);
        Assert.assertEquals(2, result2);


    }
}
