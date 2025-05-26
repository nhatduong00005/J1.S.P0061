package controller;

import constants.ShapeConstants;
import dto.ShapeDataDTO;
import service.ShapeService;
import util.InputUtil;

public class ShapeController {
    private ShapeService shapeService;

    public ShapeController() {
        shapeService = new ShapeService();
    }

    public void start() {
        System.out.println(ShapeConstants.HEADER);

        ShapeDataDTO shapeData = new ShapeDataDTO();

        // Nhập dữ liệu cho Rectangle
        System.out.print(ShapeConstants.PROMPT_RECTANGLE_WIDTH);
        double rectWidth = InputUtil.readPositiveDouble();
        shapeData.setRectangleWidth(rectWidth);

        System.out.print(ShapeConstants.PROMPT_RECTANGLE_LENGTH);
        double rectLength = InputUtil.readPositiveDouble();
        shapeData.setRectangleLength(rectLength);

        // Nhập dữ liệu cho Circle
        System.out.print(ShapeConstants.PROMPT_CIRCLE_RADIUS);
        double circleRadius = InputUtil.readPositiveDouble();
        shapeData.setCircleRadius(circleRadius);

        // Nhập dữ liệu cho Triangle trong vòng lặp cho tới khi hợp lệ
        boolean validTriangle = false;
        while (!validTriangle) {
            System.out.print(ShapeConstants.PROMPT_TRIANGLE_SIDE_A);
            double sideA = InputUtil.readPositiveDouble();

            System.out.print(ShapeConstants.PROMPT_TRIANGLE_SIDE_B);
            double sideB = InputUtil.readPositiveDouble();

            System.out.print(ShapeConstants.PROMPT_TRIANGLE_SIDE_C);
            double sideC = InputUtil.readPositiveDouble();

            try {
                // Cố gắng khởi tạo đối tượng Triangle để kiểm tra điều kiện tam giác
                new model.Triangle(sideA, sideB, sideC);
                // Nếu không exception, lưu giá trị vào DTO
                shapeData.setTriangleSideA(sideA);
                shapeData.setTriangleSideB(sideB);
                shapeData.setTriangleSideC(sideC);
                validTriangle = true;
            } catch (IllegalArgumentException ex) {
                System.err.println("Lỗi: " + ex.getMessage());
                System.out.println("Vui lòng nhập lại tam giác hợp lệ.");
            }
        }

        // Gọi service xử lý các hình và hiển thị kết quả
        shapeService.processShapes(shapeData);
    }
}
