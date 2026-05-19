package OOP.Polymorphism.InheritancePolymorphism;

public class Clothing extends Product{
    String size;
    public Clothing(String name,double price,String size){
        super(name,price);
        this.size=size;

    }

    @Override
    public void displayinfo() {
        super.displayinfo();

    }
}
