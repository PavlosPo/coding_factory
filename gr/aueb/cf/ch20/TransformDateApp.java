package gr.aueb.cf.ch20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TransformDateApp {

    public static void main(String[] args) {
        String date = "07/03/2023";
        String transformedDate = "";

        Pattern pattern = Pattern.compile("(\\d{2})/(\\d{2})/(\\d{4})");    // groups with parenthesis ()
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            // System.out.println(matcher.group(1));   // 07
            // System.out.println(matcher.group(2));   // 03
            // System.out.println(matcher.group(3));   // 2023
            String month = matcher.group(1);
            String day = matcher.group(2);
            String year = matcher.group(3);

            transformedDate = day + "/" + month + "/" + year;
        }

        System.out.println(transformedDate);
    }


}
