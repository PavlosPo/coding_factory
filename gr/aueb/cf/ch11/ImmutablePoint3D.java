package gr.aueb.cf.ch11;


/**
 * Εδώ είναι Immutable επειδή η Point3D φροντίσαμε να είναι Immutable πριν.
 * Επομένως, εδώ δεν έχουμε θέμα να επιστρέψουμε τον δείκτη.
 */
public final class ImmutablePoint3D {

    private final ImmutablePoint point;

    private final int z;

    public ImmutablePoint3D() {
        point = new ImmutablePoint();
        z = 0;
    }
     public ImmutablePoint3D(ImmutablePoint point, int z) {
        this.point = point;
        this.z = z;
     }

     public ImmutablePoint getPoint() {
        return point;
     }

     public int getZ() {
        return z;
     }
}
