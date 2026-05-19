package OOP.Polymorphism.InheritancePolymorphism;

public class Product {
    String name;
    double price;
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void displayinfo(){
        System.out.println("name "+ name+" price $"+price);
    }
}
