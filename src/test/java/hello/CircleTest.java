package hello;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void shouldConvertToFrame(){

        System.out.println(Math.sin(30));
        Circle circle = new Circle(40);
        Frame frame = circle.toFrame();
        assertTrue(frame.containsPixel(new Pixel(20, 30, false)))
    }


}