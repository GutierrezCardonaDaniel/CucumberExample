package org.example.cucumber;

import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     *
     */
    @Test
    public void TestSum()
    {
        int x = 15;
        int y = 5;
        int expectedResult = 20;
        int actualResult = Calculator.sum(x,y);
        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *
     */
    @Test
    public void TestMultiply()
    {
        int x = 3;
        int y = 5;
        int expectedResult = 15;
        int actualResult = Calculator.multiply(x,y);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestMultiplyBy0()
    {
        int x = 3;
        int y = 0;
        int expectedResult = 0;
        int actualResult = Calculator.multiply(x,y);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestDivide()
    {
        float x = 1f;
        float y = 2f;
        float expectedResult = 1f/2;
        float actualResult = Calculator.divide(x,y);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void TestDivideBy0()
    {
        float x = 3;
        float y = 0;
        int expectedResult = 0;
        float actualResult = Calculator.divide(x,y);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
