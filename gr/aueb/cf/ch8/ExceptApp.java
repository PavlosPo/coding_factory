package gr.aueb.cf.ch8;


import java.io.IOException;

/**
 * Demonstrates the usage of Exceptions.
 */
public class ExceptApp {

    public static void main(String[] args) throws IOException {
        int ch;
        int[] arr = new int[10];

        try {
            ch = getNextChar();
            System.out.println(ch);
        } catch (IOException e) {
            System.out.println("Error in I/O");
        }

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static int getNextChar() throws IOException{
        int ch = ' ';

        try {
            ch = System.in.read();
            return ch;
        } catch (IOException e){
            // 1. Rollback
            // 2.
            e.printStackTrace();
            throw e;
        }
    }
}
