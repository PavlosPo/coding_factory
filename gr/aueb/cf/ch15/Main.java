package gr.aueb.cf.ch15;

public class Main {

    private final static Point[] points;
    private static int count = 0;
    private static int count2d = 0;
    private static int count3d = 0;

    static  {
        points = new Point[] {
                new Point(1), new Point2D(1, 2), new Point3D(1, 2, 3),
                new Point(29), new Point3D(4, 9, 23)
        };
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point2D(1, 1);
        p2.movePlus10();
        System.out.println(p2);

//        for (Point point : points) {
//            if (point instanceof Point3D) {
//                count3d++;
//            } else if (point instanceof Point2D) {
//                count2d++;
//            } else {
//                count++;
//            }
//        }
//
//        System.out.println("Point instances: " + count);
//        System.out.println("Point2D instances: " + count2d);
//        System.out.println("Point3D instances: " + count3d);



//        Point p1 = new Point();
//        Point p2 = new Point2D(5, 9);
//        Point p3 = new Point3D();
//
//        doMovePlus10(p1);
//        doMovePlus10(p2);
//        doMovePlus10(p3);
//
//        // p2.getY(); δεν λειτουργεί επειδή είναι Point.
//        ((Point2D) p2).setY(5); // Αυτό λέγεται downcast, εφόσον της αλλάξαμε τύπο.
//                                // και το κάνουμε στη .setY() επειδή δεν είναι overwrite.
//        p3.movePlusOne();
//
//        doPrintPoint(p2);

    }

    public static void doMovePlus10(Point point) { // Πολεομορφική παράμετρος, εφόσον μπορεί να πάρει παράμετρο
                                                    // που έχει πολλές μορφές. Point, Point2D, Point3D.
        point.movePlus10();                         // έχει νόημα να καλούμε μεθόδους που έχουν πάθει overwrite.
    }

    public static void doPrintPoint(Point point) {
        // System.out.println(point.toString());
        System.out.println(point);
    }
}
