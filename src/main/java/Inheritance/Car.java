package Inheritance;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }
    public void displayDetails() {
        displayBrand();
        System.out.println("Doors: " + doors);
    }
}
