package gr.aueb.cf.ch15;

public class Point {
    private int x;

    public Point() {}

    public Point(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

//    public String convertToString() {
//        return "(" + x + ")";
//    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }


    protected void movePlusOne() {
        x += 1;
    }

    // self-use

    /**
     * @ImplSpec
     */
    public void movePlus10() {
        // x += 10;

        for (int i = 1; i <= 10; i++) {
            movePlusOne();
        }
    }

    private void reset() {
        x = 0;
    }
}
