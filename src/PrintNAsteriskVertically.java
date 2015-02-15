import java.util.Scanner;

/**
 * Created by sanjanar on 15/02/15.
 */
public class PrintNAsteriskVertically {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=input.nextInt();
        for(int i=1;i<=number;i++) {
                System.out.println("* ");
        }
    }
}
