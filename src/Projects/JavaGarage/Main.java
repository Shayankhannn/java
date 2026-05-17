package Projects.JavaGarage;

public class Main {
    public static void main(String[] args){
        Car colorado = new Car();
        colorado.make = "chevrolet";
        colorado.color = "black";
        colorado.model = "colorado";

        Car mustang = new Car();
        mustang.make = "ford";
        mustang.color = "red";
        mustang.model = "mustang";
        Car ferrari = new Car("ferrari", "ferrari", "red");
        colorado.accelerate();
        mustang.turn();

        System.out.println(colorado);
        System.out.println(mustang);
        System.out.println(ferrari);

    }
}
