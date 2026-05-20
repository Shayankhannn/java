package Projects.ShapeAdvanceOOP;

public class Rectangle extends Shape{
    private  double width;
    private  double height;

    Rectangle(double w,double h){
        this.height = h;
        this.width = w;
    }

    @Override
    public double CalculateArea() {

        return this.width * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle with width=" + this.width + " height=" + this.height);
    }

    @Override
    public double perimeter() {
        return this.width+this.width+this.height+this.height;
    }
}
