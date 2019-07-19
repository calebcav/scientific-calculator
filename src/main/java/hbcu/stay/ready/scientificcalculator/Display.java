package hbcu.stay.ready.scientificcalculator;

public class Display {

    String[] displayModeList = {"binary", "octal", "decimal", "hexadecimal"};

    String displayMode = "binary";

    String unitsMode = "Degrees";

    private double currentNumber = 0;

    public double getCurrentNumber(){
        return currentNumber;
    }

    public void clear(){
        currentNumber = 0;
    }

    public void setCurrentNumber(double a){
        currentNumber = a;
    }

    int i = 0;

    public void switchDisplayMode(){
        i ++;
        if (i == 4){
            i = 0;
        }
        displayMode = displayModeList[i];
    }

    public void switchDisplayMode(String mode){
        displayMode = mode;
    }

    public void switchUnitsMode(){
        if (unitsMode == "Degrees"){
            unitsMode = "Radians";
        }
        else{
            unitsMode = "Degrees";
        }
    }


}
