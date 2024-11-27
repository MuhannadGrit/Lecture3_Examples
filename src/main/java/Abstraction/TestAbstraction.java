package Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 2.2);
        Shape Rectangle = new Rectangle("Green", 2,4 );

        System.out.println("Area of the circle " + circle.area() );
        System.out.println("Color of the circle " + circle.getColor());
        System.out.println("Area of the Rectangle " + Rectangle.area());
        System.out.println("Color of the Rectangle " + Rectangle.getColor());
    }
}
