//Name: Alexis Boyachek
//Date: 29 October 2024
//Class: Computer Science 30 Period 1
//Project: A-17 Miles Per Hour AEB
//Description: Calculator for given miles, hours and minutes, which outputs the resulting speed
public class MilesPH {
//create function to plug in vales into a conversion equation
    public double calcNums(){
//set values of miles, hours and minutes
        double mi = 45;
        double h = 0;
        double min = 32;
//use equation: distance = miles * ((minutes / 60) + hours)
        double s = mi*((min / 60) + h);
//return double value of the result
        return s;
    }
//create function to print value
    public void printNums(){
        System.out.println("Your speed for this given distance was " + calcNums() + "MPH");
    }
}
