package view;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public class ShapeView {
    public static void displayResults(Rectangle rectangle, Circle circle, Triangle triangle) {
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + triangle.getSideA());
        System.out.println("Side B: " + triangle.getSideB());
        System.out.println("Side C: " + triangle.getSideC());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
