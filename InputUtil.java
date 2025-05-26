
package util;

import java.util.Scanner;
import exception.InvalidInputException;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readPositiveDoubleOnce() throws InvalidInputException {
        String input = scanner.nextLine();
        try {
            double value = Double.parseDouble(input);
            if (value <= 0) {
                throw new InvalidInputException("Giá trị phải là số dương.");
            }
            return value;
        } catch (NumberFormatException ex) {
            throw new InvalidInputException("Định dạng số không hợp lệ.");
        }
    }

    public static double readPositiveDouble() {
        while (true) {
            try {
                return readPositiveDoubleOnce();
            } catch (InvalidInputException ex) {
                System.out.println("Lỗi: " + ex.getMessage() + ". Vui lòng nhập lại:");
            }
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}
