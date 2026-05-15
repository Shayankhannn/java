package fundamentals;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args)
    {

        // reversing string
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the string you want to reverse");
        String reverseString = keyboard.nextLine();

            String reversed ="";
        for (int i = reverseString.length()-1; i >=0 ; i--) {
            char ch = reverseString.charAt(i);
            reversed = reversed + ch ;
        }
        System.out.println(reversed);

        if (reverseString.equals(reversed))
        {
            System.out.println("the string is palindrome :" + reverseString);
        }
        else{
            System.out.println("the string is not palindrome :" + reverseString);

        }

    }


}
