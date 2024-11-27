package Polymorphism;

public class Car extends Vehicle {

    @Override
    void start(){
        super.start();
        System.out.println("Car starts with key");
    }
}
