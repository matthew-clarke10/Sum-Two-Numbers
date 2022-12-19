import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int A = scan.nextInt();
        System.out.println("Now enter a second number: ");
        int B = scan.nextInt();
        System.out.println("The sum of these two numbers is " + (A+B) + ".");
        System.exit(0);
    }
}
