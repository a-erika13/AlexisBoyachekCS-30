import java.util.Scanner;
public class Temp {
    public class convertC{
        public double convert(double F){
            double convert;
            double C = (5/9) * F - 32;
            return F;
        }
    }
    public class insertF{
        Scanner f = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        double tempF = f.nextDouble();
        double answer = convertC.convert(f)
        System.out.printf("Your temperature conversion is %.1f");
    }
}