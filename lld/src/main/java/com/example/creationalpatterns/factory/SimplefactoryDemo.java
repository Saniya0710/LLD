package com.example.creationalpatterns.factory;
import com.example.creationalpatterns.Shape;
import com.example.creationalpatterns.ShapeType;

public class SimplefactoryDemo {
    public static void main(String[] args) {
    
         System.out.println("======= Simple Factory Design Pattern ======");

         ShapeType shapetype = ShapeType.CIRCLE;
         Shape shape = Shapefactory.createShape(shapetype);
         shape.draw();
         shape.computeArea();
    }
}