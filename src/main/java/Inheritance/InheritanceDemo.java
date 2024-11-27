package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        Bicycle bicycle = new Bicycle("Tesla", 21);

        car.displayBrand();
        car.displayDetails();
        bicycle.displayDetails();
    }
}
