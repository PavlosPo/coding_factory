package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyApp {

    public static void main(String[] args) {
        String passwordFile = "thanos:1234;chris:4567;alice:8907;";

        Pattern patterns = Pattern.compile(".*?;");     // Reluctant    using   ?;
        Matcher matcher = patterns.matcher(passwordFile);

        while (matcher.find()) {        // while matches stil lexists in the file
            System.out.println(matcher.group());
        }
    }
}
