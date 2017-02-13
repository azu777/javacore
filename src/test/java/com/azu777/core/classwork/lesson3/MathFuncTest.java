package com.azu777.core.classwork.lesson3;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by azu on 2/13/2017.
 */
public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest(){
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}