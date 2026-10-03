public class Q12 {
    public static void main(String[] args) {
        String s = "10.5";
        int x = Integer.parseInt(s);  // NumberFormatException
        System.out.println(x);
    }
}