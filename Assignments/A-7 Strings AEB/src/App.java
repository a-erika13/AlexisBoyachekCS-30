public class App {
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy";
        System.out.println(message1);
        System.out.println(message1.indexOf("very"));
        System.out.println(message1.length());
        System.out.println(message1.substring(0,5) + message1.substring(10,15));
        
        System.out.println("-------------");

        String message2 = "That was great -- lol";
        System.out.println(message2);
        System.out.println(message2.indexOf("lol"));
        System.out.println(message2.length());
        System.out.println(message2.substring(0,18) + "Laugh Out Loud");
    }
}
