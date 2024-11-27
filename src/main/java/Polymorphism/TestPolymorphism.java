package Polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {
        Vehicle vehicle;

        vehicle = new Vehicle();
        vehicle.start();

        vehicle = new Car();
        vehicle.start();

        vehicle = new Motorcycle();
        vehicle.start();
    }
}
