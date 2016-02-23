package hello;

/**
 * Created by yteng on 2/23/16.
 */
public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Frame toFrame(){
        Frame frame = new Frame();
        for(int arc=0;arc<=360;arc=arc+30){
            int x= (int) (Math.cos(arc)*radius);
            int y= (int) (Math.sin(arc)*radius);
            frame.addPixel(new Pixel(x, y, false));
        }
        return frame;
    }
}
