package gr.aueb.cf.ch7.homework;

import java.util.Scanner;

/**
 * It has two methods. One to encrypt and one to  decrypt the
 * given value.
 */
public class EncryptAndDecryptApp {

    public static void main(String[] args) {
        String encryptedMessage = "";
        String decryptedMessage = "";
        Scanner in = new Scanner(System.in);
        String message = "";

        // Message
        System.out.println("Please Insert anything to Encrypt: ");
        message = in.nextLine();

        // Encrypt
        encryptedMessage = encrypt(message);
        System.out.println("Encrypted Message: " + encryptedMessage);

        // Decrypt
        decryptedMessage = decrypt(encryptedMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);

    }

    public static String encrypt(String strArg) {
        // We will use it to get the encrypted string.
        StringBuilder encryptedArg = new StringBuilder();
        int chAsciiCodeEncrypted = 0;

        // We encrypt
        for (char ch : strArg.toCharArray()){
            // Typecast the ch into an int to ge the Ascii num and raise by one
            chAsciiCodeEncrypted = (int) ch + 1;
            // Replace the ch with the encrypted ascii code but typecast it to char, to get a char instead of ascii num
            // Then append it to the string builder class for better performance
            encryptedArg.append((char) chAsciiCodeEncrypted);
        };
        return encryptedArg.toString();
    }

    public static String decrypt(String strArr) {
        StringBuilder decryptedArg = new StringBuilder();
        int chAsciiCodeDecrypted = 0;

        // We decrypt
        for (char ch: strArr.toCharArray()) {
            // Typecast to get the ascii code and subtract 1.
            chAsciiCodeDecrypted = (int) ch - 1;
            // Replace the ch with the decrypted ascii code, typecast it to char to get a char
            // and then append and return the stringbuilder item for performance.
            decryptedArg.append((char) chAsciiCodeDecrypted);
        }
        return decryptedArg.toString();
    }
}
