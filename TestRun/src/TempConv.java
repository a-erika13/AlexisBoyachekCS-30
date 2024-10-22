import java.util.Scanner;
public class TempConv {

    private Scanner f = new Scanner(System.in);
    private double tempF = f.nextDouble();
    private double C;

    public void insertF(){
        System.out.println("Enter temperature in fahrenheit: ");
        //tempF = f.nextDouble();
        tempF = 32;
    }

    public void convertC(){
        C = (5.0/9.0) * tempF - 32;

    }

    public void result() {
        System.out.println("Your temperature conversion is " + C + "C");
    }

}
