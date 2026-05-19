package OOP.Polymorphism.InheritancePolymorphism;

public class Main {
    public static void main(String[] args){
        Electronics laptop = new Electronics("Laptop",1200,21);
        Clothing tShirt = new Clothing("T-shirt", 90,"xl");
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(laptop);
        cart.addItem(tShirt);
    }
}
