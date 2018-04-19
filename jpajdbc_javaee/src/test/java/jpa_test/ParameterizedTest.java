package jpa_test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    @Parameterized.Parameter(0)
    public int number1;
    @Parameterized.Parameter(1)
    public int number2;
    @Parameterized.Parameter(2)
    public int summ;

    @Parameterized.Parameters
    public static Collection parameters(){
        Object[][] parameters = {{1, 2, 3}, {4, 5, 9}, {3, 4, 7}};
        return Arrays.asList(parameters);
    }
    @Test
    public void testCalculator(){
       // int sumExpected = number1 + number2;
        Calculator calculator = new Calculator();
        int actualSumm = calculator.summ(number1, number2);

        Assert.assertEquals(summ, actualSumm);
    }
}

class Calculator{
    public int summ(int num1, int num2){
        return num1 + num2;
    }
}
