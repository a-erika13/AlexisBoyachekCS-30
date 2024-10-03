//Name: Alexis Boyachek
//Date: 24 September 2024
//Class: Computer Science 30 Period 1
//Project: A-6 Varibles AEB
//Description: Calculate how many chicken wings you are able to buy with $4.75 for $0.75

public class App {
    public static void main(String[] args) throws Exception {
        // define variables (Price, availale money, wings you can purchase, and how much it will cost)
        double wingPrice = 0.75;
        double money = 4.75;
        double buyWings = (int)(money / wingPrice);
        double wingTotal = (wingPrice * buyWings);

        // tell user how many wings they can buy and how much it will cost
        System.out.println("With $4.75, you can purchase: " + buyWings);
        System.out.println("for the price of: $" + wingTotal);
    }
}
