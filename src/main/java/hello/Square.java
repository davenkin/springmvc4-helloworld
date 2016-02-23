package hello;

/**
 * Created by yteng on 2/19/16.
 */
public class Square {
    public static final String X = "X";
    public static final String SPACE = " ";
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        drawTopLine(stringBuilder);
        drawMiddleLines(stringBuilder);
        drawBottomLine(stringBuilder);
        return stringBuilder.toString();
    }

    private void drawMiddleLines(StringBuilder stringBuilder) {
        for (int yIndex = 0; yIndex < length - 2; yIndex++) {
            stringBuilder.append(X);
            for (int xIndex = 0; xIndex < length - 2; xIndex++) {
                stringBuilder.append(SPACE);
            }
            stringBuilder.append(X);
            stringBuilder.append("\n");
        }
    }

    private void drawBottomLine(StringBuilder stringBuilder) {
        for (int xIndex = 0; xIndex < length; xIndex++) {
            stringBuilder.append(X);
        }
    }

    private void drawTopLine(StringBuilder stringBuilder) {
        for (int xIndex = 0; xIndex < length; xIndex++) {
            stringBuilder.append(X);
        }
        stringBuilder.append("\n");
    }

    public static void main(String[] args) {
        System.out.println(new Square(4).draw());
    }


}
