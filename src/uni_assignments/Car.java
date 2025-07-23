package uni_assignments;

public class Car {
    String make;
    String model;
    String color;

    void drive() {
        System.out.println("Driving");
    }

    void stop() {
        System.out.println("Stopping");
    }

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.color = "mate black";
        bmw.make = "BMW";
        bmw.model = "M8";
        bmw.drive();
        bmw.stop();
    }
}
