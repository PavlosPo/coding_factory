package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class JULApp {

    public static void main(String[] args) {

        try {
            Scanner sc = getFileDescriptor("src/gr/aueb/cf/ch6/text_files/intfile2.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }

    public static Scanner getFileDescriptor(String s) throws FileNotFoundException{
        // Περνάει ένα όνομα αρχείου
        File fd = new File(s);
        Logger logger = getLogger();

        try {
            return new Scanner(fd);
        } catch (FileNotFoundException e) {
            logger.severe("File not found" + e.getMessage());       // Εδώ χρειάζεται ο Logger,
            // για να δημιουργείτε το αρχείο με το "τι έγινε".
            throw e;
        }
    }


    public static Logger getLogger() {
        Logger logger = Logger.getLogger(JULApp.class.getName());   // .class.getName() = Βάζουμε το όνομα της κλάσης (ενδεικτικά)
        Handler fileHandler;

        try {
            fileHandler = new FileHandler("cf.log", true);      // true = append if exists, create if not exists.
            // .setFormatter() κάνει format το αρχέιο, έτσι ώστε να μην κάνει xml, επιστρέφει κείμενο
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.addHandler(fileHandler);
        return logger;
    }
}
