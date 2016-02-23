package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class SquareTest {

    @Test
    public void shouldConvertToFrame() {
        Square square = new Square(4);
        Frame frame = square.toFrame();
        assertTrue(frame.containsPixel(new Pixel(1, 1, true)));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowException() {
        Square square = new Square(-4);
    }

    @Test
    public void shouldCombineSquares() {
        Square square = new Square(6);
        Square square1 = new Square(3);
        String output = square.toFrame().withAnother(square1.toFrame()).draw();

        String expected = "XXXXXX\n" +
                "X X  X\n" +
                "XXX  X\n" +
                "X    X\n" +
                "X    X\n" +
                "XXXXXX\n";
        assertThat(output, is(equalTo(expected)));

    }


}