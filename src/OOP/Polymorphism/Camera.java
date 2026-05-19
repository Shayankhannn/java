package OOP.Polymorphism;
// compile time polymorphism
public class Camera {
    public void takingPicture() {
        System.out.println("Taking an 8 megapixels picture in portrait mode.");
    }
    public void takingPicture(String mode){
        System.out.println("taking picture in " + mode + " mode. ");
    }
    public void takingPicture(int resolution){
        System.out.println("taking picture in " + resolution + " megapixels. ");
    }
    public void takingPicture(String mode , int resolution){
        System.out.println("taking a " + resolution + " megapixels picture in a  " + mode + " mode.");
    }


}
