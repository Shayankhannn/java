package Projects.ShapeAdvanceOOP;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle: ");
        System.out.print("Enter Width:");
        double w = keyboard.nextDouble();
        System.out.print("Enter height:");
        double h = keyboard.nextDouble();
        Rectangle rectangle = new Rectangle(w,h);
        rectangle.draw();
        System.out.println("Calculated Rectangle  area : " + rectangle.CalculateArea());
        System.out.println("Calculated Rectangle  perimeter is : " + rectangle.perimeter());
        System.out.println("--------------");
        System.out.println("Calculating Area of Circle: ");
        System.out.print("Enter radius:");
        double r = keyboard.nextDouble();
        Circle circle = new Circle(r);
        circle.draw();
        System.out.println("Calculated Circle area : " + circle.CalculateArea());
        System.out.println("Calculated Circle perimeter is : " + circle.perimeter());


    }
}
