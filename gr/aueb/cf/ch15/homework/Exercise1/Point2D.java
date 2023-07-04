package gr.aueb.cf.ch15.homework.Exercise1;

public class Point2D extends Point{
    private int y;

    public Point2D() {}

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
    }
}
