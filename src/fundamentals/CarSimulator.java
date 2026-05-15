package fundamentals;

import java.util.Scanner;
public class CarSimulator {
    public static void main(String[] args) {

        // TODO 1: Declare the necessary variables for the car's state and add scanner object
        Scanner keyboard = new Scanner(System.in);
        boolean   isStart = false;
        String  gearSelect = "P";
        int accelerate = 0;
        int brake = 0;
        int choice = 0;

        // TODO 2: Display the current state of the car (engine state, gear, speed)


        // TODO 3: Add print statements for each variable you want to display or options available to the user
        // 1. Turn on/off the engine
        System.out.println("Car Engine is :" + (isStart ? "Turn On" :  "Turn Off") + "You can Either Start engine or Off it by selecting option 1 ");
        // 2. Change gear (P, D, R)
        System.out.println("the car is on :" + gearSelect + " You can select between P D R for gear selection choose option 2");
        // 3. Accelerate
        System.out.println("the car Speed is on :" + accelerate + "you can choose option 3 to increase speed by 10km/h");

        // 4. Brake
        System.out.println("You can choose to brake it will slowly decrease the speed by 20km/h you can choose again to decrease again for brake choose 4 :");
        // 5. Exit
        System.out.println("You can exit the simulation by writing 5  :");

        // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
        System.out.println("-----------------------------------");
        System.out.println("-------------Car Dashboard----------------------");
        System.out.println("You have following choices to choose from");
        System.out.println("1 : for engine to turn it on/off");
        System.out.println("2 : for gear select only P D R");
        System.out.println("3 : for accelerate by 10km/h ");
        System.out.println("4 : for brake it will decrease speed by 10km/h");
        System.out.println("5 :to exit the simulation");

        // TODO 5: Implement a switch statement to handle the different menu choices


        // TODO 6: Make sure the program runs until the user decides it's time to stop. Consider enclosing TODO 2 -> TODO 5 above in a while loop!

        while(choice != 5)
        {
            System.out.println("choose between 1 to 5 acc to rules mention above");
            choice = keyboard.nextInt();
            switch (choice)
            {
                case 1 :
                    isStart = !isStart;
                    System.out.println("Car Engine is :" + (isStart ? "Turn On" :  "Turn Off") );
                    break;
                case 2 :
                        keyboard.nextLine();
                    while(true){
                        System.out.println("Enter Gear (P D R ) : ");
                        gearSelect = keyboard.nextLine();
                        if (gearSelect.equalsIgnoreCase("P")||gearSelect.equalsIgnoreCase("D") || gearSelect.equalsIgnoreCase("R") )
                        {
                            System.out.println("Current Gear is :  " + gearSelect);
                        break;
                        }
                    else{
                    System.out.println("Invalid Gear Selected Try Again !!!");
                }
                    break;
                    }
                case 3 :
                    if (isStart && !gearSelect.equals("P"))
                    {
                        accelerate += 10;
                        System.out.println(" Speed Accelerated by 10, Current Speed : " + accelerate);
                    }
                    else {
                        System.out.println("Cannot accelerate either engine is off or gear is at P");
                    }
                    break;
                case 4 :
                    if (isStart && !gearSelect.equals("P"))
                    {
                        brake = accelerate;
                        brake -= 10;
                        System.out.println("Current Speed is decreasing to : " + brake);
                    }
                    else {
                        System.out.println("Cannot brake either engine is off or gear is at P");
                    }
                    break;
                case 5 :
                    System.out.println("The simulator shut down  ! Thank You");
            }
        }


    }
}

