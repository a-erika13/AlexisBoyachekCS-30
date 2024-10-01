public class App {
//Name: Alexis Boyachek
//Date: 28 September 2024
//Class: Computer Science 30 Period 1
//Project: A-7 Strings AEB

    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy";
        System.out.println(message1);
        // use indexOf() to find out where the word you are wanting to remove begins
        System.out.println(message1.indexOf("very"));
        // use length() to find out whwere the collective string ends
        System.out.println(message1.length());
        System.out.println(message1.substring(0,5) + message1.substring(10,15));
        
        System.out.println("-------------");

        String message2 = "That was great -- lol";
        System.out.println(message2);
        // use indexOf() to find out where the word you are wanting to remove begins
        System.out.println(message2.indexOf("lol"));
        // use length() to find out whwere the collective string ends
        System.out.println(message2.length());
        System.out.println(message2.substring(0,18) + "Laugh Out Loud");
    }
}
