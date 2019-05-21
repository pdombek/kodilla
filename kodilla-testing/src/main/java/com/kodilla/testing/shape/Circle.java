package com.kodilla.testing.shape;

public class Circle implements Shape {

    public double r;

    public Circle(double r) {
        this.r = r;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return r*r*3.14;
    }
}
