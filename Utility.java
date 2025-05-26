
package util;


public class Utility {
    /**
     * Làm tròn số đến 6 chữ số thập phân.
     *
     * @param value Giá trị cần làm tròn.
     * @return Giá trị đã được làm tròn.
     */
    public static double formatDouble(double value) {
        double factor = 1_000_000.0; // Sử dụng cách viết underscore cho số lớn
        return Math.round(value * factor) / factor;
    }
}


