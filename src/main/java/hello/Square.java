package hello;

/**
 * Created by yteng on 2/19/16.
 */
public class Square {
    private final int length;

    public Square(int length) {
        if (length < 0) {
            throw new RuntimeException("Length must be above zero");
        }

        this.length = length;
    }

    public Frame toFrame() {
        Frame frame = new Frame();

        for (int x = 1; x <= length; x++) {
            frame.addPixel(new Pixel(x, 1));
            frame.addPixel(new Pixel(x, length));
        }

        for (int y = 1; y < length; y++) {
            frame.addPixel(new Pixel(1, y));
            frame.addPixel(new Pixel(length, y));
        }

        return frame;
    }


    public static void main(String[] args) {
        System.out.println(new Square(3).toFrame().withAnother(new Square(6).toFrame()).draw());
    }
}
