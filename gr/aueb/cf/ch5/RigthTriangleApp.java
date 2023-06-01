package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές από τον χρήστη, τις
 * α, β, c,  με α η υποτείνουσα.
 *
 * Ελέγχει άν το τρίγωνο είναι ορθογώνιο, δηλ.
 * πυθαγόρειο θεώρημα.
 */
public class RigthTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;
        final double EPSILON = 0.000005;

        System.out.println("Please insert a, b and c of the triangle.");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a*a - b*b - c*c) <= EPSILON;
        System.out.printf("Triangle: %b", isRight);

    }
}
