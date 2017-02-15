package edu.ucsd.cs110.temperature;

/**
 * Created by joannelee on 2/15/17.
 */
public class Fahrenheit extends Temperature{

    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = (this.getValue() - 32) * ((float) 5/9);
        return new Celsius(value);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        float value = this.getValue();
        return "" + value + " F";
    }
}
