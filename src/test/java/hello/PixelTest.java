package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PixelTest {

    @Test
    public void should_be_equal() {
        Pixel onePixel = new Pixel(2, 3, true);
        Pixel anotherPixel = new Pixel(2, 3, true);
        assertEquals(onePixel, anotherPixel);
    }

}