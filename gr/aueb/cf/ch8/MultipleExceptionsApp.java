package gr.aueb.cf.ch8;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("/Users/pavlospoulos/IdeaProjects/CodingFactory/src/gr/aueb/cf/ch6/text_files/intfile.txt");

        char ch;
        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        }  catch (FileNotFoundException | RuntimeException e2) {
            System.out.println("File not found error");
        } catch (IOException e) {
            System.out.println("Read error");
        } catch (Exception e3) {
            System.out.println("Ooppss unknown error");
        }
    }
}
