package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Διαβάζει από ένα αρχείο με μορφή δεδομένων
 * country1 city1 city2 city3 ...
 * country2 city2 city3 city4 ...
 *
 * και γράφει κάθε γραμμή σε διαφορετικό output αρχείο
 *
 * Χρησιμοποιούμε java.io package. Sychronized = Thread Safe/Lock
 * */
public class CitiesIOApp {

    public static void main(String[] args) {
        String line;
        String[] cities;
        File dir = new File("./tmp/");

        if (!dir.exists()) {
            // Αν πάμε να το δημιουργήσουμε και έρθει κάποιο λάθος.
            if (!dir.mkdir()) {
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }
        try (BufferedReader bf = new BufferedReader(new FileReader("./tmp/cities.txt"))) {
            // Διαβάζουμε το αρχείο cities μέχρι να τελειώσει
            while ((line = bf.readLine()) != null) {    // Έτσι όπως σύγκρινα != null, ελέγχει το line, το δεξιό μέρος της ισότητας αγνοείται.
                cities = line.split(" +");
                switch  (cities[0]) {
                    case "Greece":
                        File grFile = new File(dir + "/" + cities[0].substring(0, 2).toUpperCase() + ".txt");
                        PrintStream gr = new PrintStream(grFile, StandardCharsets.UTF_8);
                         print(gr, "GR Cities");
                         print(gr, cities);
                         break;
                    case "USA":
                        File usaFile = new File(dir + "/" + cities[0].substring(0, 2).toUpperCase() + ".txt");
                        PrintStream usa = new PrintStream(usaFile, StandardCharsets.UTF_8);
                        print(usa, "USA Cities");
                        print(usa, cities);
                        break;
                    case "Germany":
                        File deFile = new File(dir + "/" + cities[0].substring(0, 2).toUpperCase() + ".txt");
                        PrintStream de = new PrintStream(deFile, StandardCharsets.UTF_8);
                        print(de, "DE Cities");
                        print(de, cities);
                        break;
                    default:
                        System.err.println("Error in Cities");
                        break;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void  print(PrintStream ps , String message) {
        ps.println(message);        // Έτσι ώστε να γράψει το gr cities
    }

    //Υπερφορτωμένη η print από πάνω.
    public static void print(PrintStream ps, String[] tokens) {
        for (int i = 1; i < tokens.length; i++ ) {
            ps.println(tokens[i] + " ");
        }
    }
}
