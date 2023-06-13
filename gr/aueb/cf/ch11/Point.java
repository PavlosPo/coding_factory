package gr.aueb.cf.ch11;

import java.util.Random;

/**
 * A simple {@link Point} Java Bean.
 *
 * @version 1.1
 * @since 0.1
 * @author pavlospoulos
 */
public class Point {
    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * It just calls the constructor to return an instance of the class
     * @return
     */
    public static Point getPoint() {
        return new Point();
    }

    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextInt(101), rnd.nextInt(101));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String pointToString() {
        return "(" + x + ", " + y + ")";
    }
}
