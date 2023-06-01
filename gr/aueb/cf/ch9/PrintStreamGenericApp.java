package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("tmp/cf.txt");

        printMessage(ps, "Hello World");        // Γράφει στο αρχέιο
        printMessage(System.out, "Hello Coding Factory");   // Γράφει στην κονσόλα, εφόσον το System.out είναι τύπος PrintStream.
    }

    public static void  printMessage(PrintStream ps , String message) {
        // Το γράφει σε φάκελο.
        ps.println(message);
    }
}
