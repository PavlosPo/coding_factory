package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {

    public static void main(String[] args) {
        // Κάναμε την PrintStream Wrapper Κλάση για να έχουμε το Autoflush ενεργοποιημένο.
        try (PrintStream ps = new PrintStream(new FileOutputStream("tmp/fos.txt", true), true, StandardCharsets.UTF_8)) {
            // το true το FIleOutPutStream βάζουμε true για να κάνει append το αρχείο.
            ps.println("Καλησπέρα!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
