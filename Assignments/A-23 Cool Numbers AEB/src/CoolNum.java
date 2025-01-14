//Name: Alexis Boyachek
//Date: 30 November 2024
//Class: Computer Science 30 Period 1
//Project: A-23 Cool Numbers AEB
//Description: Checks user input number to see if it is a "cool number" (remainder of 1 when divided by 3, 4, 5, and 6)
            //and will cound how many cool numbers are between 6 and the user's input
//import scanner
import java.util.Scanner;

public class CoolNum {
    //create new scaneer and variable to store user input
    private Scanner n = new Scanner(System.in);
    private int cn;

    public void insertNum() {
        //prompt user to enter integer
        System.out.println("Enter an integer: ");
        cn = n.nextInt();
    }

    public void isCoolNumber() {
        //create variables to store the counter to track cool numbers between 6 and user input
       int x = 6;
       int count = 0;

        //create perameter to check user input 
        if ((cn%3==1)  &&  (cn%4==1)  && (cn%5==1) && (cn%6==1)){
           System.out.println(cn + " is a cool number");
        }
        //create loop to track numbers between 6 and user input
       while (x <= cn) {
            if  ((x%3==1)  &&  (x%4==1) && (x%5 ==1) && (x%6 == 1)){
                count++;
            }
            x++;
        }
        System.out.println("there are " + count + " cool numbers between 6 and " + cn);
    }
    //close scanner
    public void close(){
        n.close();
    }
}




