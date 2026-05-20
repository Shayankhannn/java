package Projects.ShapeAdvanceOOP;

public class Circle extends Shape{
    private double radius ;

    Circle(double r){
        this.radius=r;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with Radius :" + radius);
    }

    @Override
    public double CalculateArea() {
        return 3.14 * (this.radius*this.radius);
    }

    @Override
    public double perimeter() {
        return 2*3.14*this.radius;
    }
}
