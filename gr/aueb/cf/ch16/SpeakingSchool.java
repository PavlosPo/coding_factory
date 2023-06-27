package gr.aueb.cf.ch16;

/**
 * Tightly coupled.
 */
public class SpeakingSchool {
    private Cat cat = new Cat();

    public SpeakingSchool() {}

    public void learnToSpeak() {
        cat.speak();
    }
}
