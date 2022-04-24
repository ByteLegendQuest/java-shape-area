package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {
    @Test
    public void behaveCorrectly() {
        Shape square = new Square(1d);
        Assertions.assertEquals(1d, square.getArea());

        Shape rect = new Rectangle(1d, 2d);
        Assertions.assertEquals(2d, rect.getArea());

        Shape circle = new Circle(2d);
        Assertions.assertEquals(Math.PI, circle.getArea());
    }

    @Test
    public void inheritanceTest() {
        double a = 1;
        double b = 2;
        Shape triangle =
                new Shape() {
                    @Override
                    public double getArea() {
                        return a * b / 2;
                    }
                };

        Assertions.assertEquals(a * b / 2, triangle.getArea());
    }
}
