
/**
 * Write a description of class Heater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double min;
    private double max;
    private double increment;

public Heater() {
    temperature = 15.0;
    increment = 5.0;
    min = 16.0;
    max = 32.0;
}

public double getTemp() {
    return temperature;
}

public void doWarmer() {
    if (temperature>max) {
        temperature = temperature;
    }
    else {
        temperature = temperature + increment;
    }
}

public void doCooler() {
    if (temperature<min) {
        temperature = temperature;
        }
    else {
        temperature = temperature - increment;
        }
    }
    
public void setIncrement(double icrt) {
    assert icrt>1 : "no"; 
    increment = icrt;
    //if (icrt>1) {
       // increment = icrt;
    //}
    //else {
      //  increment = increment;
      //  System.out.println("no");
    }
}

