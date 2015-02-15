import java.util.Scanner;

/**
 * Created by sanjanar on 15/02/15.
 */
public class DiamondWithName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i = 0; i < number-1; i++) {
            for (int space = 0; space < number - i - 1; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Bill");
        for (int i = number - 1; i >= 1; i--) {
            for (int space = 0; space < (number - i); space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
