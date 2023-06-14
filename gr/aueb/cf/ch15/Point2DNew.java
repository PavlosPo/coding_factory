package gr.aueb.cf.ch15;

/**
 * Composition & Forwarding
 * Wrapper & Decoration
 * Delegation Pattern
 */
public class Point2DNew {
    // Composition - private instance
    private Point point;
    private int y;

    public Point2DNew(Point point, int y) {
        this.point = point;
        this.y = y;
    }

    // Forwarding - we are calling methods of point.
    public void movePlus10() {
        point.movePlusOne();
        y += 10;
    }

    public void movePlusOne() {
        point.movePlusOne();
        y += 1;
    }
}
