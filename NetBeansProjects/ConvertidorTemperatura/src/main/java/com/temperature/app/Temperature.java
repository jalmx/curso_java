/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.temperature.app;

/**
 *
 * @author xizuth
 */
public class Temperature {

    // javadoc
    /**
     * Method to convert temperature from Celsius to Fahrenheit
     *
     * @param celsius
     * @return temperature Fahrenheit
     */
    public double convertCelsiusToFahrenheit(double celsius) {

        return (celsius * 9 / 5) + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double convertCelsiusToKelvin(double celsius){
        return celsius + 273.15;
    }
    
    public double convertKelvintoFahrenheit(double kelvin) {
        return 1.8* (kelvin -273.15) + 32;
    }
    
    public double convertFahrenheitToKelvin(double fahrenheit){
        return  ((fahrenheit -32)/1.8) + 273.15;
    }

}
