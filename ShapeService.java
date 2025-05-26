package service;

import dto.ShapeDataDTO;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.ShapeView;

public class ShapeService {
    public void processShapes(ShapeDataDTO data) {
        Rectangle rectangle = new Rectangle(data.getRectangleWidth(), data.getRectangleLength());
        Circle circle = new Circle(data.getCircleRadius());
        Triangle triangle = new Triangle(data.getTriangleSideA(), data.getTriangleSideB(), data.getTriangleSideC());

        // Giao nhiệm vụ hiển thị cho lớp View
        ShapeView.displayResults(rectangle, circle, triangle);
    }
}
