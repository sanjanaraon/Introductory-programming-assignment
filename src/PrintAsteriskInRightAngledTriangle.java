import java.util.Scanner;

/**
 * Created by sanjanar on 15/02/15.
 */
public class PrintAsteriskInRightAngledTriangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=input.nextInt();
        for(int i=1;i<=number;i++) {
            for (int j = 1;j<=i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
