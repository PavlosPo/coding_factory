package gr.aueb.cf.ch10;

import java.security.Key;
import java.sql.Array;
import java.util.ArrayList;

public class CryptoApp {

    public static void main(String[] args) {
        final int key = 300;
        String s = "Coding#";

        String encrypted = encrypt(s, key).toString();
        System.out.println(encrypted);

        String decrypted = decrypt(encrypt(s, key), key).toString();
        System.out.println(decrypted);


    }

    public static ArrayList<Integer> encrypt(String s, int key) {
        ArrayList<Integer> encrypted = new ArrayList<>();
        char ch;
        int i;

        int prev = cipher(s.charAt(0), -1, key);
        encrypted.add(prev);

        i = 1;
        while ((ch = s.charAt(i)) != '#'){
            encrypted.add(cipher(ch, prev, key));
            prev = encrypted.get(i);
            i++;
        }

        encrypted.add(-1);
        return encrypted;
    }

    public static ArrayList<Character> decrypt(ArrayList<Integer> encrypted, int key) {
            ArrayList<Character> decrypted = new ArrayList<>();
            int token;
            int i;
            int prevToken;

            prevToken = decipher(encrypted.get(0), -1, key);
            decrypted.add((char) prevToken);

            i = 1;
            while ((token = encrypted.get(i)) != -1) {
                decrypted.add(decipher(token, prevToken, key));
                prevToken = token;
                i++;
            }

            return decrypted;


    }

    public static int cipher(char ch, int prev, int key) {
        if (prev == -1) return ch;      // Αν -1 είναι ο προηγούμενος, τότε return ch.
        return (ch + prev) % key;       // Μετατρέπει τον ch σε int αυτόματα.
    }

    public static char decipher(int cipher, int prev, int key) {
        if (prev == -1) return (char) cipher;       // Μετατρέπεται σε char αυτόματα
        return (char) ((cipher - prev + key) % key);
    }
}
