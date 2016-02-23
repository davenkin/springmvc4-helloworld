package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FrameTest {

    @Test
    public void shouldDrawFrame() {
        Frame frame = new Frame();
        frame.addPixel(new Pixel(2, 2));
        String output = frame.draw();
        String expected = "  \n" +
                " X\n";
        assertThat(output, is(equalTo(expected)));
    }

}