package com.example.creationalpatterns.factory.factorymethod;
import com.example.creationalpatterns.Circle;
import com.example.creationalpatterns.Shape;

public class CircleCreater extends ShapeFactory {
    
    @Override
    public Shape createShape() {
        return new Circle();
    }
    

}
