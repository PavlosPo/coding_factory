package gr.aueb.cf.ch11;

/**
 * Immutable Point ~ Strict Immutable κλάση.
 */
public class ImmutablePoint {

    /*
    1. final πεδία
    2. no setters
    3. final class (strict immutable) ~ Δεν μπορεί να κληρονομηθεί η κλάση
    4. instances mutable ~ Αν υπάρχουν από άλλες κλάσεις, πρέπει να προσέχουμε να μην κάνουμε return άμεσα τα πεδία αυτών.
     */

    private final int x;
    private final int y;

    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

