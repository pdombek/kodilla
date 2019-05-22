package com.kodilla.testing.shape;

public class Square implements Shape {

    public double a;

    public Square(double a) {
        this.a = a;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return a*a;
    }

}
