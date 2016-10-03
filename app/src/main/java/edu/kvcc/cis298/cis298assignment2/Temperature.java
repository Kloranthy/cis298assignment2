package edu.kvcc.cis298.cis298assignment2;

import android.util.Log;

/**
 * Author: Josh
 *
 * Purpose: converts temperatures from one format to another.
 */

public class Temperature
{
    private static final String TAG = "Temperature";
    private static final int CELSIUS = 1;
    private static final int FAHRENHEIT = 2;
    private static final int KELVIN = 3;
    private static final int RANKINE = 4;

    public static double convertTemperature(double value, int sourceFormat, int targetFormat)
    {
        Log.d(TAG, "convertTemperature(double, int, int) called");
        // convert from source format to celsius
        switch(sourceFormat)
        {
            case CELSIUS :
            {
                // do nothing
                break;
            }
            case FAHRENHEIT :
            {
                value -= 32;
                value = value * 5 / 9;
                break;
            }
            case KELVIN :
            {
                value -= 273.15;
                break;
            }
            case RANKINE :
            {
                value -= 491.67;
                value = value * 5 / 9;
                break;
            }
            default : // wtf??
            {
                // log an error or something
            }
        }
        // convert from celsius to target format
        switch(targetFormat)
        {
            case CELSIUS :
            {
                // do nothing
                break;
            }
            case FAHRENHEIT :
            {
                value = value * 9 / 5;
                value += 32;
                break;
            }
            case KELVIN :
            {
                value += 273.15;
                break;
            }
            case RANKINE :
            {
                value = value * 9 / 5;
                value += 491.67;
                break;
            }
            default : // wtf??
            {
                // log an error or something
            }
        }
        return value;
    }
}
