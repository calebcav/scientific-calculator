package hbcu.stay.ready.scientificcalculator;

public class CoreFeatures {


    Display display = new Display();

    public void add(double b){

        display.setCurrentNumber(display.getCurrentNumber() + b);
    }


    public void subtract(double a){
        display.setCurrentNumber(display.getCurrentNumber() - a);
    }

    public void multiply(double a){
        display.setCurrentNumber(display.getCurrentNumber() * a);
    }


    public void divide(double a){

        if (a== 0){
            System.out.println("Cannot divide by Zero");
        }
        else {
            display.setCurrentNumber(display.getCurrentNumber() / a);
        }
    }



    public void square(){
        display.setCurrentNumber(Math.pow(display.getCurrentNumber(), 2));
    }

    public void squareRoot(){
        display.setCurrentNumber(Math.sqrt(display.getCurrentNumber()));
    }

    public void exponentation(double a){
        display.setCurrentNumber(Math.pow(display.getCurrentNumber(), a));
    }

    public void inverse(){
        display.setCurrentNumber(1/ display.getCurrentNumber());
    }

    public void invertSign(){
        if (display.getCurrentNumber() > 0){
            display.setCurrentNumber( - display.getCurrentNumber());
        }
        else if (display.getCurrentNumber() < 0){
            display.setCurrentNumber(display.getCurrentNumber() * -1);
        }
        else{
            display.setCurrentNumber(0);
        }
    }


}
