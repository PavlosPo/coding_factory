package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataApp {

    public static void main(String[] args) {

        int b = 0;      // Ta bytes που διαβάζει η in.read()
        int count = 0;  //
        byte[] buffer = new byte[8192];     // Εδώ διαβάζουμε 4kb τη φορά. Πιο efficient. Αντί για b.
        long start, end;
        double elapsed;

        try (FileInputStream in = new FileInputStream("./tmp/aerials.mp4");
             FileOutputStream out = new FileOutputStream("./tmp/v1out.mp4")) {

            // 1ος τρόπος
            // Όσο διαβάζει ενα ενα τα bytes μέχρι να μην έχει κανένα, επιστρέφει -1 = in.read()

            while ((b = in.read()) != -1) { // Διαβάζει 1 byte την φορά, άρα είναι insufficient.
                out.write(b);
                count += b;

            }

            // 2ος τρόπος με το buffer.
            start = System.currentTimeMillis();
            while ((b = in.read(buffer)) != -1) { // Διαβάζει 4kb την φορά, άρα πιο efficient από πριν.
                out.write(buffer, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.00;
            System.out.println(elapsed + " secs");
            System.out.printf("%,.2f KB", Math.ceil((double) count / 1024) );

        } catch (IOException e) {
            throw new RuntimeException(); // Κάνουμε ένα RUntime Exception, άρα θέλουμε να διακόψει,
                                        // αντι να συνεχίσει το πρόγραμμα.

        }
    }
}
