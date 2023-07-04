package gr.aueb.cf.ch20;

public class MatchesApp {

    public static void main(String[] args) {
        String s = "red";

        System.out.println(isRed(s));

        String digit = "p";
        System.out.println(isOneDigit(digit));
    }

    public static boolean isRed(String s) {
        return s.matches("red");
    }

    public static boolean isRedOrGreen(String s) {
        return s.matches("red|green");
    }

    public static boolean isOneDigit(String s) {
        // return s.matches("[0123456789]");
        return s.matches("\\d");    // regExpr -> \d, but we need another \ to escape the character \.
    }

    public static boolean isNotOneDigit(String s) {
        // return s.matches("[0123456789]");
        return s.matches("\\D");    // with capital D we say anything but else a digit.
    }

    public static boolean isOneWordChar(String s) {
        // return s.matches("[a-zA-Z0-9_]");
        // return s.matches("[^1]");    // anything but 1.
        return s.matches("\\w");
    }

    public static boolean isNotOneWord(String s) {
        return s.matches("\\W");
    }

    public static boolean isWhiteSpace(String s) {  // spaces, tabs, newlines
        return s.matches("\\s");
    }

    public static boolean isNotWhiteSpace(String s) {  // spaces, tabs, newlines
        return s.matches("\\S");
    }

    public static boolean isAnySymbol(String s) {
        return s.matches(".");
    }

    public static boolean isWholeString(String s) {
        // ^ -> beginning of string
        // $ -> end of string
        return s.matches("^.$");    // alone character.
    }


    // . any char
    // ^, $ beginning and end of string
    // [^] negation
    // \d , \D digit, not digit
    // \w, \W a-zA-Z0-9_, not a-zA-Z0-9_
    // \s, \S       space, not space

    public static boolean isZeroOrMoreDigits(String s) {
        return s.matches("\\d*");   // one or more digits
    }

    public static boolean isOneOrMoreDigits(String s) {
        return s.matches("\\d+");   // one or more digits
    }

    public static boolean isThreeDigits(String s) {
        return s.matches("\\d{3}");   // three digits
    }

    public static boolean IsZeroToThreeDigits(String s) {
        return s.matches("\\d{0,3}");   // one or two or three digits
    }

    public static boolean isMoreThanFiveDigits(String s) {
        return s.matches("\\d{5,}");   // 5 or more digits
    }

    public static boolean isLessThanFiveDigits(String s) {
        return s.matches("\\d{0,5}");   // 0 to 5 digits
    }

    public static boolean isZeroOrOneAnySymbol(String s) {
        return s.matches(".?");   // 0 or 1.
    }

    public static boolean isValidEmailAddress(String s) {
        return s.matches("\\w+\\.?\\w+@\\w+\\.(com|gr)");
    }
}
