public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();  // clears leftover newline
        String name = sc.nextLine();
        System.out.println(name + " " + age);
    }
}