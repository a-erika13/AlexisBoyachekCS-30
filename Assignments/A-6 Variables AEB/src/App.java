//Name: Alexis Boyachek
//Date: 20 September 2024
//Class: Computer Science 30 Period 1
//Project: A-6 Varibles AEB

public class App {
    public static void main(String[] args) throws Exception {
        double wingPrice = 0.75;
        double money = 4.75;
        double buyWings = (int)(money / wingPrice);
        double wingTotal = (wingPrice * buyWings);

        System.out.println("With $4.75, you can purchase: " + buyWings);
        System.out.println("for the price of: $" + wingTotal);
    }
}
