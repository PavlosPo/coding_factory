package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ths is nio class of java. It reads writes file in async.
 */
public class NioCopyApp {

    public static void main(String[] args) {
        byte[] videoBytes;      // Array of bytes
        Path sourcePath = Paths.get("./tmp/aerials.mp4");
        Path targetFile = Paths.get("./tmp/vout.mp4");

        try {
            videoBytes = Files.readAllBytes(sourcePath);        // Βάζουμε Path αντικείμενο, στη Files.readAllBytes().
            Files.write(targetFile, videoBytes);
        } catch (IOException e ) {
            e.printStackTrace();
        }
    }
}
