package OOP.Polymorphism;

public class SmartCamera extends Camera{
    @Override
    public void takingPicture() {
        super.takingPicture(); //The super keyword is used within a subclass to refer to its immediate superclass. its optional if you dont want to ruse the original method func
    System.out.println("adding AI to enhance the picture");
    }
}
