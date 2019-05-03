package test.java;

import org.junit.Assert;
import org.junit.Test;
import main.java.Calculate;

public class TestNr1{
    Calculate provider;

    public TestNr1(){

        provider = new Calculate();
    }
    @Test
    public void add()
    {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        int firstNumber = 10;
        int secondNumber = 5;
        Assert.assertEquals(15, provider.Add(firstNumber, secondNumber));
        System.out.println("Ending test");
    }
    @Test
    public void substract()
    {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        int firstNumber = 10;
        int secondNumber = 5;
        Assert.assertEquals(5, provider.Substract(firstNumber, secondNumber));
        System.out.println("Ending test");
    }
    @Test
    public void multiply()
    {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        int firstNumber = 10;
        int secondNumber = 5;
        Assert.assertEquals(50, provider.Multiply(firstNumber, secondNumber));
        System.out.println("Ending test");
    }
    @Test
    public void divide()
    {
        System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
        int firstNumber = 10;
        int secondNumber = 5;
        Assert.assertEquals(2, provider.Divide(firstNumber, secondNumber));
        System.out.println("Ending test");
    }
}