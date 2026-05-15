package fundamentals;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args)
    {
        // guessing game using while loop
        Scanner keyboard = new Scanner(System.in);
        int secretNumber = 6;
        boolean guessNumber = true;
        System.out.println("enter the number between 1 to 9 to guess secret number ");
            int userNumber;
        while ( guessNumber)
        {
            userNumber = keyboard.nextInt();
            if (userNumber == secretNumber)
            {
                guessNumber = false;
        System.out.println("You guessed the correct Number " + userNumber);

            }
            else {
        System.out.println(userNumber + " number is not secret number try again!!" );

            }


        }
    }


}
