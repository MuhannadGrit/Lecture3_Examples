package Abstraction;

import javax.naming.RefAddr;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    double area() {
        return  Math.PI * radius * radius;
    }
}
