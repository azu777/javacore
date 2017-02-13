package com.azu777.core.homework.lesson3utests20;

import com.azu777.core.homework.lesson3utests.EvaluationFunctions;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ANATOL on 13.02.2017.
 */
public class EvaluationFunctionsTest {
    //1function
    @Test
    public void addTest(){
        int a = 66, b = 55, expRes = 121;
        Assert.assertEquals(expRes, EvaluationFunctions.add(a, b));
    }
    //1function1
    @Test
    public void addTest1(){
        int a = 444, b = 333, expRes = 777;
        Assert.assertEquals(expRes, EvaluationFunctions.add(a, b));
    }
    //2function
    @Test
    public void subtractionTest(){
        int a = 100, b = 77, expRes = 23;
        Assert.assertEquals(expRes, EvaluationFunctions.substraction(a, b));
    }
    //2function1
    @Test
    public void subtractionTest1(){
        int a = 80, b = 20, expRes = 60;
        Assert.assertEquals(expRes, EvaluationFunctions.substraction(a, b));
    }
    //3function
    @Test
    public void devideTest(){
        int a = 55, b = 5, expRes = 11;
        Assert.assertEquals(expRes, EvaluationFunctions.divide(a, b));
    }
    //3function1
    @Test
    public void devideTest1(){
        int a = 99, b = 11, expRes = 9;
        Assert.assertEquals(expRes, EvaluationFunctions.divide(a, b));
    }
    //4function
    @Test
    public void multiplyTest(){
        int a = 7, b = 9, expRes = 63;
        Assert.assertEquals(expRes, EvaluationFunctions.multiply(a, b));
    }
    //4function1
    @Test
    public void multiplyTest1(){
        int a = 11, b = 5, expRes = 55;
        Assert.assertEquals(expRes, EvaluationFunctions.multiply(a, b));
    }
    //5function
    @Test
    public void squareRootTest(){
        double a = 64, expRes = 8;
        Assert.assertEquals(expRes, EvaluationFunctions.squareRoot(a), 0);
    }
    //5function1
    @Test
    public void squareRootTest1(){
        double a = 81, expRes = 9;
        Assert.assertEquals(expRes, EvaluationFunctions.squareRoot(a), 0);
    }
    //6function
    @Test
    public void powerTest(){
        double a = 2, b = 3, expRes = 8;
        Assert.assertEquals(expRes, EvaluationFunctions.power(a, b), 0);
    }
    //6function1
    @Test
    public void powerTest1(){
        double a = 3, b = 3, expRes = 27;
        Assert.assertEquals(expRes, EvaluationFunctions.power(a, b), 0);
    }
    //7function
    @Test
    public void moduleTest(){
        int a = -123, expRes = 123;
        Assert.assertEquals(expRes, EvaluationFunctions.module(a));
    }
    //7function1
    @Test
    public void moduleTest1(){
        int a = -444, expRes = 444;
        Assert.assertEquals(expRes, EvaluationFunctions.module(a));
    }
    //8function
    @Test
    public void roundTest(){
        double a = 7.6, expRes = 8;
        Assert.assertEquals(expRes, EvaluationFunctions.round(a), 0);
    }
    //8function1
    @Test
    public void roundTest1(){
        double a = 14.5, expRes = 15;
        Assert.assertEquals(expRes, EvaluationFunctions.round(a), 0);
    }
    //9function
    @Test
    public void maxTest(){
        int a = 16, b = 25, expRes = 25;
        Assert.assertEquals(expRes, EvaluationFunctions.max(a, b));
    }
    //9function1
    @Test
    public void maxTest1(){
        int a = 23, b = 87, expRes = 87;
        Assert.assertEquals(expRes, EvaluationFunctions.max(a, b));
    }
    //10function
    @Test
    public void minTest(){
        int a = 22, b = 11, expRes = 11;
        Assert.assertEquals(expRes, EvaluationFunctions.min(a, b));
    }
    //10function1
    @Test
    public void minTest1(){
        int a = 2, b = 35, expRes = 2;
        Assert.assertEquals(expRes, EvaluationFunctions.min(a, b));
    }
}
