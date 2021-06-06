package hillel.java_vvp.hw_check.j1_hw.testing.nikita;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {
    @Test
    public void testCheckOurMassive() {
        int[][] testArray = {{4, 5}, {3, 3, 6, 8}};

        Matrix matrix = new Matrix();
        boolean result = matrix.OurMassive(testArray, false);
        Assert.assertEquals(true, result);
    }
}
