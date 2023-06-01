package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 6 - 1 + 1) + 1;  // min = 1 , max = 6, cast = int
        // mathematical expression -> (Math.random() * max - min + 1 ) + min
        System.out.println(die);
    }
}
