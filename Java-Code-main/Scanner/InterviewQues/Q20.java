import java.util.Scanner;

// Error CODE - name never gets read
// public class Q20BErrorCode {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();       // reads 25, leaves \n in buffer
//         String name = sc.nextLine();  // reads leftover \n, skips name
//         System.out.println(name);     // prints empty
//     }
// }

// FIXED CODE
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();                // clears the leftover \n
        String name = sc.nextLine();  // now reads name correctly
        System.out.println(name);
        System.out.println(age);
    }
}

