package hello;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yteng on 2/23/16.
 */
public class Frame {
    public static final String X = "X";
    public static final String SPACE = " ";
    private Set<Pixel> pixels = new HashSet<Pixel>();

    public void addPixel(Pixel pixel) {
        pixels.add(pixel);
    }


    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        int maxLength = calculateManLength();
        for (int xIndex = 1; xIndex <= maxLength; xIndex++) {
            for (int yIndex = 1; yIndex <= maxLength; yIndex++) {
                Pixel currentPixel = new Pixel(xIndex, yIndex, true);
                if (pixels.contains(currentPixel)) {
                    Pixel originalCurrentPixel = null;
                    boolean isX = false;
                    for (Pixel pixel : pixels) {
                        if (pixel.equals(currentPixel)) {
                            isX = pixel.isX();
                        }
                    }

                    if (isX) {
                        stringBuilder.append(X);
                    } else {
                        stringBuilder.append("*");
                    }
                } else {
                    stringBuilder.append(SPACE);
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    private int calculateManLength() {
        int maxLength = 0;
        for (Pixel pixel : pixels) {
            int currentLength = pixel.getX();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

    public boolean containsPixel(Pixel pixel) {
        return pixels.contains(pixel);

    }

    public Frame withAnother(Frame frame) {
        pixels.addAll(frame.pixels);
        return this;
    }
}
