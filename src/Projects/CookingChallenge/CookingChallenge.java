package Projects.CookingChallenge;

import java.util.Scanner;

public class CookingChallenge {

    public static double calculateIngredientQuantity(int servings,double originalQuantity)
    {
        return servings*originalQuantity;
    }
    public static void spiceUpDish(int spiceLevel)
    {
        switch (spiceLevel)
        {
            case 1 :
                System.out.println("its not spicy");
            break;
            case 2 :
                System.out.println("its spicy");
            break;
            case 3 :
                System.out.println("its spicy spicy");
            break;
            case 4 :
                System.out.println("its very very spicy");
            break;
            case 5 :
                System.out.println("its burning spicy spicy");
            break;


        }
    }
    public static void greetGuest(String name,String timeOfDay)
    {

            System.out.println("hi " + name + ", Good " + timeOfDay );
//        if (timeOfDay.equalsIgnoreCase("morning"))
//        {
//            System.out.println("hi " + name + ", Good Morning" );
//        } else if (timeOfDay.equalsIgnoreCase("evening")) {
//
//            System.out.println("hi " + name + ", Good Evening" );
//        } else if (timeOfDay.equalsIgnoreCase("afternoon")) {
//            System.out.println("hi " + name + ", Good Afternoon" );
//
//        }else {
//            System.out.println("hi " + name + ", Good " + timeOfDay );
//
//        }
    }
public static void main(String[] args)
{
    Scanner keyboard = new Scanner(System.in);
    int servings , spiceLevel;
    double originalQuantity;
    String name,timeOfDay;

    System.out.println("please enter the desired servings :");
    servings = keyboard.nextInt();
    System.out.println("please enter the Original Quantity :");
    originalQuantity = keyboard.nextDouble();
    System.out.println("the updated ingredient quantity is  :" + calculateIngredientQuantity(servings,originalQuantity));

    System.out.println("please enter the desired Spice level from 1 to 5 :");
    spiceLevel = keyboard.nextInt();
//    System.out.println("Your desired spice level is  :" + spiceUpDish(spiceLevel));
        spiceUpDish(spiceLevel);
    keyboard.nextLine();
    System.out.println("please enter Your name");
    name = keyboard.nextLine();
    System.out.println("please enter time of the day");
    timeOfDay = keyboard.nextLine();
    greetGuest(name,timeOfDay);



}

}


