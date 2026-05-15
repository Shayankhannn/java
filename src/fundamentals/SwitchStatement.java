package fundamentals;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the flavor you want ");
        String iceCreamFlavour = keyboard.nextLine();

        switch (iceCreamFlavour)
        {
            case "Vanilla" :
        System.out.println("I will enjoy my Vanilla icecream ");
        break;
            case "Strawberry" :
        System.out.println("I will enjoy my strawberry icecream ");
        break;
            case "Chocolate" :
        System.out.println("I will enjoy my Chocolate icecream ");
        break;
            default:
                System.out.println("I will enjoy my water bottle ");


        }

    }
}
