//Name: Alexis Boyachek
//Date: 31 October 2024
//Class: Computer Science 30 Period 1
//Project: A-22 Leap Year AEB
//Description: Prompts user to enter a year and the program will then output if the year was/ is/ will be a leap year
import java.util.Scanner;

//import scanner
public class Leap {
    private Scanner y = new Scanner(System.in);
    private int leapYear;
//create private constant variable so that user input can be called multiple times

//create function that prompts user to enter a year
    public void insertYear(){
        System.out.println("Enter year: ");
        leapYear = y.nextInt();
    }
//create function that outputs leap year or not with the perameters: IS divisible by 4, IS NOT divisible by 100, IS divisible by 400
    public void calcLeap(){
        if (leapYear % 4 == 0){
            System.out.println(leapYear + " is a leap year");
        }
        else if (leapYear %100 != 0){
            System.out.println(leapYear + " is not a leap year");
        }
        else if (leapYear %400 == 0){
            System.out.println(leapYear + " is a leap year");
        }
    //print results
    }
}

