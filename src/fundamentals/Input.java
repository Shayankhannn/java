package fundamentals;
import java.util.Scanner;
public class Input {
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("enter the age");
    int age = keyboard.nextInt();
    System.out.println("here is the age : " + age);

    System.out.println("enter the money");
    float money = keyboard.nextFloat();
    System.out.println("here is the money : " + money);

    keyboard.nextLine(); // so string is not skipped
    System.out.println("enter the name");
    String name = keyboard.nextLine();
    System.out.println("here is the name : " + name);




    }
}
