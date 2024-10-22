public class App {
    public static void main(String[] args) throws Exception {
        int x = 4;
        int y = 3;
        if (x < 0){
            if (x > y){
                System.out.println("x is greater than y and greater than 0");
            }
        }
        else if (x == 0){
            System.out.println("x is zero");
        }
        else {
            System.out.println("x is positive");
        }
       
        //can use instead of nested if statements
        if (x > 0 && x > y) {
            System.out.println("x is greater than y and greater than 0");
        }

        if (x > 0){
        System.out.println("Not a winner");
        }
        else if (x > 5){
            System.out.println("Not a winner");
        }
        else {
            System.out.println("Winning number");
        }
    }
}

