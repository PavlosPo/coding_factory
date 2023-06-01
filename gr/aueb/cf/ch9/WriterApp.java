package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("tmp/test1.txt", StandardCharsets.UTF_8);     // Εδώ το printstream αυτό, μπορεί να γράφει UTF_8.
            PrintWriter pw = new PrintWriter("tmp/test2.txt")) {
         ps.println("Hello CF! From print stream!");
         pw.println("Hello CF! from print writer!, Γεια!");
         pw.flush();    // Αντί να περιμένει να γεμίσει ο buffer, τα γράφει κατευθείαν στην consola
        } catch (IOException e) {
            System.out.println("File path not found");
        }
    }
}
