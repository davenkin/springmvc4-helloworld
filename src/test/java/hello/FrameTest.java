package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FrameTest {

    @Test
    public void shouldDrawFrame() {
        Frame frame = new Frame();
        frame.addPixel(new Pixel(2, 2, false));
        frame.addPixel(new Pixel(2, 3, true));
        frame.addPixel(new Pixel(2, 4, true));
        String output = frame.draw();
        System.out.println(output);
        String expected = "  \n" +
                " *X\n";
        assertThat(output, is(equalTo(expected)));
    }

}