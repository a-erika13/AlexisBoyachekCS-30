//NOT FINISHED
import java.util.Scanner;

public class CoolNum {
    private Scanner n = new Scanner(System.in);
    private double cn;

    public static boolean isCoolNumber( int num )
    {
        int x; 
        x = 6;
        for(x = 6; x<num; x++)
        {
        if ((x%3==1)  &&  (x%4==1)  && (x%5 ==1) && (x%6 == 1))

            return true;

        }
        return false;

    }

    public static int countNumbers( int stop ){


        //add counter


    }

    public static void main( String[] args )
    {
        System.out.println( CoolNum.countNumbers(250) + " cool numbers between 6 - " + 250);
        //add more test cases
    }  
}

