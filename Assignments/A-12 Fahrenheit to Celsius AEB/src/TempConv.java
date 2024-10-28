//Name: Alexis Boyachek
//Date: 14 October 2024
//Class: Computer Science 30 Period 1
//Project: A-12 Fahrenheit to Celsius AEB
//Description: Temperature converter for degrees fahrenheit to degrees celcius that promts users to enter the double values
import java.util.Scanner;

//import scanner
public class TempConv {
    private Scanner f = new Scanner(System.in);
    private double tempF;
    private double C;

//create function to call in runner for user to enter in their values
    public void insertF(){
        System.out.println("Enter temperature in fahrenheit: ");
        tempF = f.nextDouble();
    }
//create function to call on that converts the given values to celcius: (5/9)*(farhenheit - 32)
    public void convertC(){
        C = (5.0/9.0) * (tempF - 32);
    }
 //print results
    public void result() {
        System.out.println("Your temperature conversion is " + C + "C");
    }
}