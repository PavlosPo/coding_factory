package gr.aueb.cf.ch9;

import java.io.*;

public class CopyRawDataAppBuferedStream {

    public static void main(String[] args) {

        int b = 0;      // Ta bytes που διαβάζει η in.read()
        int count = 0;  //
        byte[] buffer = new byte[8192];     // Εδώ διαβάζουμε 4kb τη φορά. Πιο efficient. Αντί για b.
        long start, end;
        double elapsed;

        // Κάνουμε το ίδιο όπως στο CopyRawDataApp απλά αλλάζουμε το Stream.
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("./tmp/aerials.mp4"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("./tmp/v1out.mp4"))) {

            start = System.currentTimeMillis();
            while ((b = in.read(buffer)) != -1) {
                out.write(buffer, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.00;
            System.out.println(elapsed + " secs");
            System.out.printf("%,.2f KB", Math.ceil((double) count / 1024) );

        } catch (IOException e) {
            throw new RuntimeException();

        }
    }
}
