package jpa_test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JunitRunnerTest {


    @BeforeClass
    public static void initClass(){
        System.out.println("before class");
    }

    @Before
    public void initC(){
        System.out.println("before");
    }

    @Test
    public void test1(){
        String str = "test";
        Assert.assertEquals(str, "test");
    }
    @Test
    public void test2(){
        String str = "test";
        Assert.assertEquals(str, "test");
    }
}
