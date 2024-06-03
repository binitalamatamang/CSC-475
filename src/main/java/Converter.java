package com.example.myapplication;

public class Converter {

    // Temperature Conversion
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Add more conversion methods for length, weight, etc.
}
