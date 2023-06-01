package gr.aueb.cf.ch7;

/**
 * Transforms strings.
 */
public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "   Athens Uni  ";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = "";
        String s3 = " ";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println("*".repeat(10));

        // Ελεγχουμε αν κατι έχει length 0
        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }
    }
}
