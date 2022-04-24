package com.bytelegend;

public abstract class Shape {
    public abstract double getArea();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {new Square(1.0), new Rectangle(1.0, 2.0), new Circle(1.0)};
        for (Shape shape : shapes) {
            System.out.println(
                    "The area of " + shape.getClass().getSimpleName() + "is: " + shape.getArea());
        }
    }
}
