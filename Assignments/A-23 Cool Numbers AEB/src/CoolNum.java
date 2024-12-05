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
       int x = 6;
       int count = 0;

        if ((cn%3==1)  &&  (cn%4==1)  && (cn%5==1) && (cn%6==1)){
           System.out.println(cn + " is a cool number");
        }
        
       while (x <= cn) {
            if  ((x%3==1)  &&  (x%4==1) && (x%5 ==1) && (x%6 == 1)){
                count++;
                x++;
            }
        }
        System.out.println("there are " + count + " cool numbers between 6 and " + cn);

    }
}


