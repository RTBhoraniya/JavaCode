import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            Integer.parseInt(input);
            System.out.println("Valid Number");
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number");
        }
    }
}