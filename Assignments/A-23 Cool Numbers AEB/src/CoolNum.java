//NOT FINISHED
import java.util.Scanner;

public class CoolNum {
    private Scanner n = new Scanner(System.in);
    private int cn;

    public void insertNum() {
        System.out.println("Enter an integer: ");
        cn = n.nextInt();
    }
    public void isCoolNumber() {
        //int x; 
       // x = 6;

        if ((cn%3==1)  &&  (cn%4==1)  && (cn%5==1) && (cn%6==1)){
           System.out.println(cn + " is a cool number");
        }
       // while (x) {
            //if ((cn%3==1)  &&  (cn%4==1)  && (cn%5 ==1) && (cn%6 == 1)){}
            //System.out.println("there are " + x + " cool numbers between 6 and " + cn);
        }

    }


