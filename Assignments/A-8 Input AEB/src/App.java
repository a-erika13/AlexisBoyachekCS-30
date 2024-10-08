import java.util.Scanner;
//import scanner

public class App {
//Name: Alexis Boyachek
//Date: 1 October 2024
//Class: Computer Science 30 Period 1
//Project: A-8 Input AEB
//Description: Inputing values and assigning the to variables in order to add them in the output
    public static void main(String[] args) throws Exception {
        try (//define scanner
        Scanner s = new Scanner(System.in)) {
            //ask for user input of int twice
            System.out.println("Enter an Integer value: ");
            int numA = s.nextInt();
            System.out.println (numA);
            System.out.println("Enter an Integer value: ");
            int numB = s.nextInt();
            System.out.println (numB);
            //add user input together and output results
            System.out.println(numA + numB);

            //ask for user input of double twice
            System.out.println("Enter a Double value: ");
            double numC = s.nextDouble();
            System.out.println(numC);
            System.out.println("Enter a Double value: ");
            double numD = s.nextDouble();
            System.out.println(numD);
            //add user input together and output results
            System.out.println(numC + numD);
        }
        

    }
}
