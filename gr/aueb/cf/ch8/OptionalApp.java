package gr.aueb.cf.ch8;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        String s = "AUEB";
        String copied = null;

        Optional<String> str = getStrCopy(s);

        if (str.isPresent()) {  // .isPresent() = αν υπάρχει δηλαδή
            copied = str.get();
        }

        System.out.println(copied);

//        str.isPresent(System.out::println);     // ??????




//        String s = null;
//        String str = getCopy(s);
//        if (str != null && str.equals("AUEB")) {
//            System.out.println(str);
//        }

    }

    public static String getCopy(String s) {
        // Παρόλο που είναι shallow copy, δεν έχουμε πρόβλημα γιατί
        // τα String είναι immutable. Επιστρέφει και null όμως.
        return s;
    }

    public static Optional<String> getStrCopy(String s) {
        if (s == null ) Optional.empty();
        return   Optional.of(s);

        // return Optional.ofNullable(s);
    }
}
