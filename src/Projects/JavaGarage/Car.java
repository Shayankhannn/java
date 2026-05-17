package Projects.JavaGarage;

class Car {
    String make;
    String model;
    String color;

    // No-argument constructor (no parameters)
    public Car() {
        this.make = "Unknown"; // Set a placeholder make
        this.model = "Unknown"; // Set a placeholder model
        this.color = "Black"; // Set a default color
    }
    // Parameterized constructor to initialize with specific values
    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public void accelerate(){
        System.out.println("the car is accelerating");
    }
    public void turn(){
        System.out.println("the car is turning");
    }
    // toString method
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
