import java.util.Scanner;

public class CoolNum {
    private Scanner n = new Scanner(System.in);
    private double cn;

    public void enterNum() {
        System.out.println("Enter a number: ");
        cn = n.nextDouble();}

    public void calcNum(){
        if ((cn%3==1)  &&  (cn%4==1)  && (cn%5 ==1) && (cn%6 == 1)){
            System.out.println("true");
        }     
    }  
}

