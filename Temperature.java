/* *****************************************
 *  Author : Celia Ho   
 *  Created On : Tue Feb 27 2024
 *  File : Temperature.java
 *  Description : Temperature
- temperature: double
- scale: char // C for Celcius, F for Fahrenheit, K for Kelvin, default (because i'm in the US) is F
+ Temperature(temperature: double)
+ Temperature(temperature: double, scale: char)
+ toCelcius(): void // changes current temperature member variable to Celcius
+ toFahrenheit(): void  // changes current temperature member variables to Fahrenheit
+ toKelvin(): void // changes current temperature member variable to Kelvin
+ setTemperature(temperature: double):void
+ setScale(scale:char):void
+ getTemperature(): double 
+ getScale(): char
+ toString(): string 

Build the Class please
 * ******************************************/

public class Temperature {
  // Attributes
  private double temperature;
  private char scale;

  // Default constructor
  public Temperature(double temperature) {
    this.temperature = temperature;
    this.scale = 'F';
  }

  // Constructor with arguments
  public Temperature(double temperature, char scale) {
    this.temperature = temperature;
    this.scale = scale;
  }

  // Methods to follow
  public void toCelsius() {
    if (scale == 'F') {
      temperature = (temperature - 32) * (5/9);   // To convert Fahrenheit to Celsius
    }
    if (scale == 'K') {
      temperature = (temperature - 273.15);       // To convert Kelvins to Celsius
    }
    
    scale = 'C';
  }

  public void toFahrenheit() {
    if (scale == 'C') {
      temperature = temperature * (9/5) + 32;    // To convert Celsius to Fahrenheit
    }
    if (scale == 'K') {
      temperature = (temperature - 273.15) * (9/5) + 32;   // To convert Kelvin to Fahrenheit
    }

    scale = 'F';
  }

  public void toKelvin() {
    if (scale == 'F') {
      temperature = (temperature - 32) / 1.8 + 273.15;    // To convert Fahrenheit to Kelvin
    }
    if (scale == 'C') {
      temperature = temperature + 273.15;          // To convert Celsius to Kelvin
    }

    scale = 'K';
  }

  // Getters and setters to follow
  public double getTemperature() {
    return temperature;
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  public char getScale() {
    return scale;
  }

  public void setScale(char scale) {
    this.scale = scale;
  }

  // toString method
  @Override
  public String toString() {
    return "Temperature [temperature=" + temperature + ", scale=" + scale + "]";
  }

  
}