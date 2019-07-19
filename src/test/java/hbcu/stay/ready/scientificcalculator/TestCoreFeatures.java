package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCoreFeatures {



    @Test
    public void addTest(){


        CoreFeatures core = new CoreFeatures();

        core.add(5);
        double actual = core.display.getCurrentNumber();

        double expected = 5;


        Assert.assertEquals(actual, expected, 0.0);


    }

    @Test
    public void subtractTest(){

        CoreFeatures core = new CoreFeatures();
        core.subtract(5);
        double actual = core.display.getCurrentNumber();

        double expected = -5;

        Assert.assertEquals(actual, expected, 0.0);

    }


    @Test
    public void multiplyTest(){

        CoreFeatures core = new CoreFeatures();
        core.display.setCurrentNumber(5);
        core.multiply(5);
        double actual = core.display.getCurrentNumber();

        double expected = 25;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void divideTest(){

        CoreFeatures core = new CoreFeatures();
        core.display.setCurrentNumber(10);
        core.divide(2);
        double actual = core.display.getCurrentNumber();

        double expected = 5;

        Assert.assertEquals(actual, expected, 0.0);
    }


    @Test
    public void squareTest(){

        CoreFeatures core = new CoreFeatures();
        core.display.setCurrentNumber(5);
        core.square();

        double actual = core.display.getCurrentNumber();

        double expected = 25;

        Assert.assertEquals(actual, expected, 0.0);

    }

    @Test
    public void squareRootTest(){

        CoreFeatures core = new CoreFeatures();
        core.display.setCurrentNumber(9);
        core.squareRoot();


        double actual = core.display.getCurrentNumber();

        double expected = 3;

        Assert.assertEquals(actual, expected, 0.0);

    }

    @Test
    public void exponentationTest(){
        CoreFeatures core = new CoreFeatures();
        core.display.setCurrentNumber(2);

        core.exponentation(3);

        double actual = core.display.getCurrentNumber();

        double expected = 8;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void inverseTest(){
        CoreFeatures core = new CoreFeatures();

        core.display.setCurrentNumber(2);

        core.inverse();

        double actual = core.display.getCurrentNumber();

        double expected = 0.5;

        Assert.assertEquals(actual, expected, 0.0);

    }

    @Test
    public void invertSignTest(){

        CoreFeatures core = new CoreFeatures();

        core.display.setCurrentNumber(3);

        core.invertSign();

        double actual = core.display.getCurrentNumber();

        double expected = -3;

        Assert.assertEquals(actual, expected, 0.0);

    }






}
