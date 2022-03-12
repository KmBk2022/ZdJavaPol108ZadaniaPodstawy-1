package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    /*
    a+ -> jedno lub więcej
    a* -> zero lub więcej
    a? -> zero lub jedno
     */
    private static final String EMAIL_REGEX = "[a-zA-Z0-9._]+\\@[a-zA-z]+(\\.[a-zA-Z]+)*";

    public static void main(String[] args) {
        System.out.println(isCorrectEmailFormat("sda@com.pl"));
        System.out.println(isCorrectEmailFormat("sda@com"));
        System.out.println(isCorrectEmailFormat("sda@sda.com.pl"));
        System.out.println(isCorrectEmailFormat("sda1@com.pl"));
        System.out.println(isCorrectEmailFormat("sda_1@com.pl"));
        System.out.println(isCorrectEmailFormat("p.dudko@com.pl"));
        System.out.println();
        System.out.println(isCorrectEmailFormat("sda@com."));
        System.out.println(isCorrectEmailFormat("@com.pl"));
        System.out.println(isCorrectEmailFormat("@@com.pl"));
        System.out.println(isCorrectEmailFormat("sda@"));
        System.out.println(isCorrectEmailFormat("sda@sda1.com"));
        System.out.println(isCorrectEmailFormat("sda"));
    }

    private static boolean isCorrectEmailFormat(String emailAddress) {
        /*
        true:
        sda@com.pl sda@com sda@sda.com.pl
        sda1@com.pl
        sda_1@com.pl
        p.dudko@com.pl

        false:
        @com.pl
        @@com.pl
        sda@
        sda@sda1.com
        sda
         */
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}
