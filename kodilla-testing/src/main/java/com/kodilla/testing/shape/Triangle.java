package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public double a;
    public double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return (a*h)/2;
    }
}
