package Abstraction;

abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double area();

    public String getColor(){
        return color;
    }
}
