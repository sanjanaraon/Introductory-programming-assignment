import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sanjanar on 16/02/15.
 */
public class GeneratePrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        long number = input.nextInt();
        List<Integer> result = primeFactorGenerator(number);
        if(result!=null) {
            System.out.println("The prime factors are:"+result);
        }else {
            System.out.println("wrong input");
        }
    }

    private static List<Integer> primeFactorGenerator(long number) {
        List<Integer> factors=new ArrayList<Integer>();
        long numberCopy=number;
        if (numberCopy > 0) {
            for (int i = 2; i <= numberCopy; i++) {
                if (numberCopy % i == 0) {
                    factors.add(i);
                    numberCopy/=i;
                    i--;
                }
            }
            return factors;
        }
        return null;
    }
}
