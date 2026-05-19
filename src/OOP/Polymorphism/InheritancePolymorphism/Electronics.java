package OOP.Polymorphism.InheritancePolymorphism;

public class Electronics extends Product{
    int warrantyPeriodInMonths;
    public Electronics(String name,double price,int warrantyPeriodInMonths){
        super(name,price);
        this.warrantyPeriodInMonths=warrantyPeriodInMonths;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Warranty : " + warrantyPeriodInMonths + " months");
    }
}
