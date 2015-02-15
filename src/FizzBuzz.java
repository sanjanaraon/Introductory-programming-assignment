import java.util.Scanner;

/**
 * Created by sanjanar on 15/02/15.
 */
public class FizzBuzz {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number up to which you want to play game ");
        int number=scanner.nextInt();
        for(int i=1;i<=number;i++){
            fizzBuzzGenerator();
        }
    }

    private static void fizzBuzzGenerator() {
        int randomNumber= (int) (Math.random()*100);
        if(randomNumber%3==0){
            System.out.println("Fizz");
        }else if(randomNumber%5==0){
            System.out.println("Buzz");
        }else if((randomNumber%3==0) && (randomNumber%5==0)){
            System.out.println("FizzBuzz");
        }else{
            System.out.println(randomNumber);
        }
    }
}
