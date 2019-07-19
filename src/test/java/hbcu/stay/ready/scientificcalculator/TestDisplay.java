package hbcu.stay.ready.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class TestDisplay {

    @Test
    public void getCurrentNumberTest(){
        Display display = new Display();

        double actual = display.getCurrentNumber();

        double expected = 0;

        Assert.assertEquals(actual, expected, 0.0);

    }

    @Test
    public void setCurrentNumberTest(){
        Display display = new Display();

        display.setCurrentNumber(5);

        double actual = display.getCurrentNumber();

        double expected = 5;

        Assert.assertEquals(actual, expected, 0.0);
    }

    @Test
    public void clearTest(){
        Display display = new Display();

        display.setCurrentNumber(4);

        display.clear();

        double actual = display.getCurrentNumber();

        double expected = 0;

        Assert.assertEquals(actual ,expected, 0.0);

    }

    @Test
    public void switchDisplayModeTest(){
        Display display = new Display();

        display.switchDisplayMode();

        String actual = display.displayMode;

        String expected = "octal";

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void switchDisplayModeTest2(){

        Display display = new Display();

        display.switchDisplayMode("decimal");

        String actual = display.displayMode;

        String expected = "decimal";

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void switchUnitsModeTest(){

        Display display = new Display();

        display.switchUnitsMode();

        String actual = display.unitsMode;

        String expected = "Radians";

        Assert.assertEquals(actual, expected);


    }

}
