package hbcu.stay.ready.scientificcalculator;

import org.junit.Test;
import org.junit.Assert;

import java.util.Scanner;

public class TestScientificFeatures {

    @Test
    public void sineTest(){
        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(2);

        calculator.sine();

        double actual = calculator.display.getCurrentNumber();

        double expected = 0.9092974268256817;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void cosineTest(){
        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(2);

        calculator.cosine();

        double actual = calculator.display.getCurrentNumber();

        double expected = -0.4161468365471424;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void tangentTest(){
        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(1);

        calculator.tangent();

        double actual = calculator.display.getCurrentNumber();

        double expected = 1.5574077246549023;

        Assert.assertEquals(actual, expected, 0.0);

    }

    @Test
    public void inverseSineTest(){
        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(1);

        calculator.inverseSine();

        double actual = calculator.display.getCurrentNumber();

        double expected = 1.5707963267948966;

        Assert.assertEquals(actual, expected, 0.0);

    }

    @Test
    public void inverseCosineTest(){

        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(1);

        calculator.inverseCosine();

        double actual = calculator.display.getCurrentNumber();

        double expected = 0;

        Assert.assertEquals(actual, expected, 0.0);
    }


    @Test
    public void inverseTangentTest(){

        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(2);

        calculator.inverseTangent();

        double actual = calculator.display.getCurrentNumber();

        double expected = 1.1071487177940904;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void factorialTest(){
        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(4);

        calculator.factorial();

        double actual = calculator.display.getCurrentNumber();

        double expected = 24;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void addToMemoryTest(){

        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(5);

        calculator.addToMemory();

        double actual = calculator.memory;

        double expected = 5;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void resetMemoryTest(){

        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(7);

        calculator.resetMemory();

        double actual = calculator.memory;

        double expected = 0;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void logTest(){
        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(10);

        calculator.log();

        double actual = calculator.display.getCurrentNumber();

        double expected = 1;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void inverseLogTest(){
        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(10);

        calculator.inverseLog();

        double actual = calculator.display.getCurrentNumber();

        double expected = 22026.465794806718;

        Assert.assertEquals(actual, expected, 0.0);

    }

    @Test
    public void naturalLogTest(){
        ScientificFeatures calculator = new ScientificFeatures();

        calculator.display.setCurrentNumber(1);

        calculator.naturalLog();

        double actual = calculator.display.getCurrentNumber();

        double expected = 0;

        Assert.assertEquals(actual, expected, 0.0);


    }


}
