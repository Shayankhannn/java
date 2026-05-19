package OOP.Polymorphism;

public class Main {
    //compile time polymorphism
    public static void main(String[] args){
         Camera myCamera = new Camera();
         myCamera.takingPicture("portrait");
         myCamera.takingPicture(12);
         myCamera.takingPicture("portrait",12);
    }
}
