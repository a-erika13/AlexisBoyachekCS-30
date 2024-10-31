//Name: Alexis Boyachek
//Date: 31 October 2024
//Class: Computer Science 30 Period 1
//Project: A-22 Miles Per Hour AEB
//Description: leap year  program runner
public class LeapRunner {
    public static void main(String[] args) throws Exception {
        Leap ly = new Leap();
//call functions from the other class
        ly.insertYear();
        ly.calcLeap();
    }
}
