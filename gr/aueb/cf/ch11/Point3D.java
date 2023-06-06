package gr.aueb.cf.ch11;

/**
 * Immutable 3D Point.
 *
 * Στην ουσία επιστρέφουμε καινούργια αντικείμενα αντί για τους δείκτες της κάθε μία
 * κλάσης που παίρνουμε σαν εισαγωγή.
 */
public final class Point3D {
    private final Point point; // Εδώ έχουμε στα πεδία μία κλάση που δεν είναι Immutable,
                                // Αρά πρέπει να φροντίσουμε να την κάνουμε Immutable
                                // Γιατί μπορεί να επιστρέψει δείκτη σε κλάση που εισάγεται σαν μεταβλητή.
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        // this.point = point; // Αυτό δεν είναι ασφαλές αφού η main μπορεί να έχει πρόσβαση σε αυτή την point.
                            // Οπότε φτιάχνουμε new Point() και απλά βάζουμε τα x και y του Point που μας φέρνει η main
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        // return point; // και εδώ έχουμε θέμα αφού επιστρέφεται ο δείκτης του point που θα περάσει από τη main.

        return new Point(this.point.getX(), this.point.getY());
    }

    public int getZ() {
        return z;
    }
}
