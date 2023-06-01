package gr.aueb.cf.ch4;


import java.math.BigInteger;
import java.util.Scanner;

/**
 * Callculates the a^n with
 * BigInteger Class
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger("0");
        BigInteger n = new BigInteger("0");
        BigInteger result = new BigInteger("1");

        System.out.println("Please insert two ints, base and power");
        a = BigInteger.valueOf(in.nextInt());
        n  = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(a);
        }

        System.out.printf("%d ^ %d = %d", a, n, result);


    }
}
