package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void shouldDrawSquare(){
        Square square = new Square(4);
        String output = square.draw();
        String expected = "XXXX\n" +
                          "X  X\n" +
                          "X  X\n" +
                          "XXXX";

        assertThat(output,is(equalTo(expected)));
    }


}