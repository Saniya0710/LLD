package com.example.creationalpatterns.factory;
import com.example.creationalpatterns.Circle;
import com.example.creationalpatterns.Rectangle;
import com.example.creationalpatterns.Shape;
import com.example.creationalpatterns.ShapeType;
import com.example.creationalpatterns.Square;

public class Shapefactory {
    
    public static Shape createShape(ShapeType shapeType) {

        if(shapeType == null) {
            return null;
        }
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
            default -> throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        };
    }
}
