package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * 'Ενας μικρός βάτραχος θέλει να περάσει ένα ποτάμι
 * Ο frog βρίσκεται στη θέση X και θέλει να φτάσει
 * θέση Y (ή σε θέση > Y). Ο frog jumps a fixed distance, D.
 *
 * Βρίσκει τον ελάχιστο αριθμό of jumps που ο small frog πρέπει
 * να κάνει ώστε να φτάσει στον στόχο του (ή να τον ξεπεράσει).
 *
 * Για παράδειγμα, αν έχουμε:
 * X = 10
 * Y = 85
 * D = 30
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * 10 jump 40 jump 70 jump 100
 *
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumps = 0;
        int startPosition = 0;
        int endPosition = 0;
        int stepJump = 0;

        System.out.println("Please insert the start, end and jump step position");
        startPosition = in.nextInt();
        endPosition = in.nextInt();
        stepJump = in.nextInt();

        jumps = (int) Math.ceil((float)(endPosition - startPosition) / stepJump);
        System.out.println("Jumps: " + jumps);

    }
}
