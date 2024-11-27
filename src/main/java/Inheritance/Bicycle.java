package Inheritance;

public class Bicycle extends Vehicle {
    private int gears;

    public Bicycle(String brand, int gears) {
        super(brand);
        this.gears = gears;
    }
    public void displayDetails() {
        displayBrand();
        System.out.println("Gears: " + gears);
    }
}
