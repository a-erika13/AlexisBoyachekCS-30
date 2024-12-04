public class LeapRunner {
    public static void main(String[] args) throws Exception {
        Leap ly = new Leap();
//call functions from the other class
        ly.insertYear();
        ly.calcLeap();
    }
}
