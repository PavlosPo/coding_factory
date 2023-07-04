package gr.aueb.cf.ch15.homework.Exercise1;

/**
 * It is a utility class {@link PointUtil} that has the .distanceFromOrigin() method
 * that returns the Distance from the origin of axes. That works with Point, Point2D, and Point3D instances.
 */
public class PointUtil {
    public PointUtil() {}

    /**
     *
     * @param currentPoint      The given Point instance, to calculate the distance.
     * @return                  The distance from the origin of axes.
     */
    public static double distanceFromOrigin(Point currentPoint) {
        return currentPoint.getDistanceFromOrigin();
    }
}
