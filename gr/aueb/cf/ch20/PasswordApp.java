package gr.aueb.cf.ch20;

import javax.xml.crypto.dsig.spec.XPathType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordApp {

    public static void main(String[] args) {
        String password = "Adddjllldd99";     // at least 6 chars, one upper-case
        Pattern pattern = Pattern.compile("(?=.*?[A-Z])(?=.*?[0-9])^.{6,}$");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
