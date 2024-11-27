package SuperExamples;

public class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle {
    int carMaxSpeed = 180;

    void display(){
        System.out.println("from Vehicle Maximum speed: " + super.maxSpeed);
    }
}

class Test{
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}