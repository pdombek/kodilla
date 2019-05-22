package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure(){
        //given
        Shape shape = new Triangle(8, 6);
        ShapeCollector shapesList = new ShapeCollector();
        shapesList.addFigure(shape);
        //when
        Shape check = shapesList.getFigure(0);
        //than
        Assert.assertEquals(shape, check);
    }

    @Test
    public void testRemoveFigure(){
        //given
        Shape shape = new Square(4);
        ShapeCollector shapesList = new ShapeCollector();
        //when
        shapesList.addFigure(shape);
        boolean removed = shapesList.removeFigure(shape);
        //than
        Assert.assertTrue(removed);
    }

    @Test
    public void testGetFigure(){
        //given
        Shape shape = new Circle(2);
        ShapeCollector shapesList = new ShapeCollector();
        //when
        shapesList.addFigure(shape);
        //than
        Assert.assertEquals(shape, shapesList.getFigure(0));
    }

    @Test
    public void testShowFigures(){
        //given
        Shape shape = new Square(2);
        Shape shape2 = new Triangle(3,6);
        ShapeCollector shapesList = new ShapeCollector();
        String expectedFigures = "Figures: " + shape.getShapeName() + " " + shape.getField() + " " + shape2.getShapeName() + " " + shape2.getField() + " ";
        //when
        shapesList.addFigure(shape);
        shapesList.addFigure(shape2);
        String list = shapesList.showFigures();
        //than
        Assert.assertEquals(list, expectedFigures);
    }
}
