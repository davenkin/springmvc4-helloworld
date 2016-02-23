package hello;

/**
 * Created by yteng on 2/23/16.
 */
public class Pixel {
    private final int x;
    private final int y;
    private final boolean isX;

    public Pixel(int x, int y, boolean isX) {
        this.x = x;
        this.y = y;
        this.isX = isX;
    }

    public int getX() {
        return x;
    }

    public boolean isX() {
        return isX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pixel pixel = (Pixel) o;

        if (x != pixel.x) return false;
        if (y != pixel.y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
