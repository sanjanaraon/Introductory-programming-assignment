import java.util.Scanner;

/**
 * Created by sanjanar on 15/02/15.
 */
public class DiamondWithName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i = 0; i < number - 1; i++) {
            printSpace(number-i-2);
            printStar(0,i*2);
            System.out.println();
        }
        System.out.println("Bill");
        for (int i = number - 1; i >= 1; i--) {
            printSpace(number -i-1);
            printStar(1,i);
            printStar(1,i-1);
            System.out.println();
        }
    }

    private static void printStar(int start,int end) {
        for (int j = start; j <= end; j++) {
            System.out.print("*");
        }
    }

    private static void printSpace(int maxSpaceToBePrinted) {
        for (int space = 0; space < maxSpaceToBePrinted; space++) {
            System.out.print(" ");
        }
    }
}
