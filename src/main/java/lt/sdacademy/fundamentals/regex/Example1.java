package lt.sdacademy.fundamentals.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches(".s", "as")); // true (taskas atstoja raide/simboli
        System.out.println(Pattern.matches(".t", "dt")); // true
        System.out.println(Pattern.matches(".d", "odt")); //false
        System.out.println(Pattern.matches(".d", "oodt")); // false
        System.out.println(Pattern.matches("..t", "odt")); // true

        // El. pasto validacija
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)//.(.+)$");
        Matcher emailMatcher = emailPattern.matcher("emilija.ramanauskaite@gmail.com");
        System.out.println(emailMatcher.matches()); // true
    }
}
