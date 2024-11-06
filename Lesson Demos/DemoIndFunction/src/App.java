public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("4 double is" + numDouble(num:4));
        System.out.println("2 double is" + numDouble(num:2));
        System.out.println("17 double is" + numDouble(num:17));
        System.out.println("1347 double is" + numDouble(num:1347));
    }
    public int numDouble(int num) {
        int ans = num*num*num;
        return ans;

    }
}
