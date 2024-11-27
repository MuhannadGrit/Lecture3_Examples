package Abstraction;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
     super(color);
     this.width = width;
     this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}
