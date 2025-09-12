import java.util.Random;
import java.util.Scanner;
public class GuessStarter {
    public static void main(String arngs[]){
        //pick a random number
        
        Random random = new Random ();
        
        int number = random.nextInt(100) + 1; //random number from 1-100
        
        Scanner read = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100 (including both)");
        System.out.println("Can you guess what it is?");
        System.out.println("Type a number: ");
        
        int guess = read.nextInt();
        
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);
        
        System.out.println("You were off by: " + Math.abs(number - guess));
        
    }
}
