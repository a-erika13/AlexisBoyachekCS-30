import java.util.Scanner;
public class Temp {
    public void convertC(double tempF){
        double C = (5.0/9.0) * tempF - 32;
        return;
    }
    public void insertF(){
        System.out.println("Enter temperature in fahrenheit: ");
        return;
        
    }
    Scanner f = new Scanner(System.in);
    double tempF = f.nextDouble();
    double answer = convertC.convert(f);
    System.out.printf("Your temperature conversion is %.1f");
}