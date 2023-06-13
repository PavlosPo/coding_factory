package gr.aueb.cf.ch11;

/**
 * Eager instantiation
 * Mono-Coding Factory Universe
 * Singleton Pattern.
 */
public class CodingFactory {
    // Singleton Design Pattern
    private static final CodingFactory INSTANCE = new CodingFactory();

    // Είναι private γιατί θα μπορούσε ο καθένας να κάνει όσο instances ήθελε.
    private CodingFactory() {}

    public static CodingFactory getInstance() {
        // Επιστρέφει ένα και μόνο INSTANCE που έχουμε κάνει από πριν construct.
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello Coding Factory");
    }
}
