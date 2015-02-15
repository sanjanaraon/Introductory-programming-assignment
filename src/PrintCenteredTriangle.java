import java.util.Scanner;

/**
 * Created by sanjanar on 15/02/15.
 */
public class PrintCenteredTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i = 0; i <number; i++) {
            for(int space=0;space<number-i-1;space++){
                System.out.print(" ");
            }
            for (int j = 0;j<i*2+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

