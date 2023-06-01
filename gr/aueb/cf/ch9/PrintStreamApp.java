package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Prints with PrintStream
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        // "try with resources" method.
        try (PrintStream ps = new PrintStream("../f1.txt")) {
            ps.println("Hello Coding Factory");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //} finally { θα κάναμε finally που θα έπρεπε να κλείναμε τα
        // τα sources αν δεν ειχαμε την "try with resources" μεθοδολογία μέσα στην try.

        }
    }
