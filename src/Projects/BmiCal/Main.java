package Projects.BmiCal;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BMICalculator bmiCalculator = new BMICalculator();
        Scanner keyboard = new Scanner(System.in);

        double weightInKilos = 0.0;
        double weightInPounds = 0.0;
        double heightInMeters = 0.0;
        double heightInInches = 0.0;
        int choice = 0;

        System.out.println(" ---- Welcome to BMI calculator !!! ---- ");
        System.out.println(" ---- choose 0 : if you want imperial system eg . weight in pounds and height in inches ---- ");
        System.out.println(" ---- choose 1 : if you want metric system eg . weight in kilos and height in meters ---- ");
        System.out.println("please choose and type between 0 and 1");

        choice = keyboard.nextInt();

        switch (choice)
        {
            case 0 :
                System.out.println("Please enter your weight in pounds");
                weightInPounds = keyboard.nextDouble();
                System.out.println("Please enter your height in inches");
                heightInInches = keyboard.nextDouble();
            break;
            case 1 :
                System.out.println("Please enter your weight in kilos");
                weightInKilos = keyboard.nextDouble();
                System.out.println("Please enter your height in meters");
                heightInMeters = keyboard.nextDouble();
            break;
            default:
                System.out.println("Please Select between 0 (imperial) and 1 (metric)");


        }


        if (choice == 0){
            double bmiImperial = bmiCalculator.calculateBmiImperial(weightInPounds,heightInInches);
            System.out.println("Your BMI based on Imperial System is :" + bmiImperial);
        }else if (choice == 1){
            double bmiMetric = bmiCalculator.calculateBmiMetric(weightInKilos,heightInMeters);
            System.out.println("Your BMI based on Metric System is :" + bmiMetric);

        }else {
            System.out.println(" Invalid Choice !!! ");

        }

            System.out.println("---- Thank You For Using BMI Calculator !!! ----");
    }
}