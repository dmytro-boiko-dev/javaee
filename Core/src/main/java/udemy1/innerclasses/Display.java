package udemy1.innerclasses;

public class Display {
    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;

    public Display(){
        Pixel pixel = new Pixel(5, 7, Color.GREEN);
    }

    public static class Pixel{
        int x;
        int y;
        Color color;

        public Pixel(int x, int y, Color color) {

            if (x > 0 && x <= DISPLAY_WIDTH && x <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creatin pixel at " + x + "," + y + " and color: " + color);
            } else {
                throw new IllegalArgumentException("Coordinates must be between "
                        + DISPLAY_HEIGHT + " and " + DISPLAY_WIDTH);
            }
        }
    }

    public enum Color{
        RED, GREEN, BLUE, BLACK
    }
}
