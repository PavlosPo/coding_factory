package gr.aueb.cf.ch11;

/**
 * Lazy instantiation.
 * Singleton pattern.
 */
public class CodingFactoryLazy {
    private static CodingFactoryLazy INSTANCE = null;

    // Είναι private γιατί θα μπορούσε ο καθένας να κάνει όσο instances ήθελε.
    // private τον constructor το κάνουμε για να κάνουμε instance control
    private CodingFactoryLazy() {}

    public static CodingFactoryLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CodingFactoryLazy();
        }
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello Coding Factory");
    }
}
