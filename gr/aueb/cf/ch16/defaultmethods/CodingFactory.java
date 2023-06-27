package gr.aueb.cf.ch16.defaultmethods;

public class CodingFactory implements IWelcome {
    // a must implementation of saySomething.
    @Override
    public void saySomething(String message) {
        System.out.println("Please get the message " + message);
    }

    // If we want we can override the default method of Interface
    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory();
        System.out.println("\u2764".repeat(5));
    }
}
