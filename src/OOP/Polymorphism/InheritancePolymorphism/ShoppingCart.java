package OOP.Polymorphism.InheritancePolymorphism;

public class ShoppingCart {
    public void addItem(Product item){
        item.displayinfo();
        System.out.println("Item added to cart. \n");
    }
}
