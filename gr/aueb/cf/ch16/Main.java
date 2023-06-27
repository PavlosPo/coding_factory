package gr.aueb.cf.ch16;

public class Main {

    public static void main(String[] args) {
        ISpeakable alice = new Cat();
        ISpeakable bob = new Dog();

        alice.speak();
        bob.speak();
    }

    public static void doSpeak(ISpeakable speakable) {
        speakable.speak();
    }
}
