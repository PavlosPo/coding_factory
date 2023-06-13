package gr.aueb.cf.ch15;

public class Point2D extends Point{
    private int y;

    public Point2D() {
//        super();   constructor of Point class ( The above class )
//        y = 0;
    }

    public Point2D(int x, int y) {
        // setX(x); --> a setter method instead of overloading constructor.
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
    public String convertToString() {
//        return super.convertToString() + "(" + y + ")";
        return "(" + getX() + ", " + y + ")";
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }
}
