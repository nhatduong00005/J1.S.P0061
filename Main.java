
package client;

import controller.ShapeController;

public class Main {
    public static void main(String[] args) {
        // Only starts up the controller.
        ShapeController controller = new ShapeController();
        controller.start();
    }
}
