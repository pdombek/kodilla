package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    public ArrayList<Shape> shapes = new ArrayList<>();
    public String result;

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        boolean removed = false;
        shapes.remove(shape);
        removed = true;
        return removed;
    }

    public Shape getFigure(int n){
        Shape shape = shapes.get(n);
        return shape;
    }

    public String showFigures() {
        for (Shape show : shapes) {
            result = show.getShapeName() + " " + show.getField();
        }
        return result;
    }


}
