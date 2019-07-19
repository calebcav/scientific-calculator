package hbcu.stay.ready.scientificcalculator;

import java.util.*;

public class ScientificFeatures extends CoreFeatures {


    double memory = 0;



    public void sine(){
        display.setCurrentNumber(Math.sin(display.getCurrentNumber()));
    }

    public void cosine(){
        display.setCurrentNumber(Math.cos(display.getCurrentNumber()));
    }

    public void tangent(){
        display.setCurrentNumber(Math.tan(display.getCurrentNumber()));
    }

    public void inverseSine(){
        display.setCurrentNumber(Math.asin(display.getCurrentNumber()));
    }

    public void inverseCosine(){
        display.setCurrentNumber(Math.acos(display.getCurrentNumber()));
    }

    public void inverseTangent(){
        display.setCurrentNumber(Math.atan(display.getCurrentNumber()));
    }

    public void factorial(){
        int current = (int) Math.round(display.getCurrentNumber());

        for(int i = current - 1;i > 0; i--){
            current *= i;
        }
        display.setCurrentNumber((double)current);
    }

    public void addToMemory(){
        memory = display.getCurrentNumber();
    }

    public void resetMemory(){
        memory = 0;
    }


    public void log(){
        display.setCurrentNumber(Math.log10(display.getCurrentNumber()));
    }

    public void inverseLog(){
        display.setCurrentNumber(Math.exp(display.getCurrentNumber()));
    }

    public void naturalLog(){
        display.setCurrentNumber(Math.log(display.getCurrentNumber()));
    }



}



