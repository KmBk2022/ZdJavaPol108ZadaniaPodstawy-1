package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task3 {
    // [0-9] => \d
    // [a-zA-Z] => \w
    private static final String NUMBER_REGEX = "-?\\d+(,\\d+)?";
    //private static final String NUMBER_REGEX = "-?[0-9]+(,[0-9]+)?";
    //"-?[0-9]+,?[0-9]+"

    public static void main(String[] args) {
        System.out.println(isCorrectNumberFormat("1"));
        System.out.println(isCorrectNumberFormat("1234,1234"));
        System.out.println(isCorrectNumberFormat("1234,123"));
        System.out.println(isCorrectNumberFormat("1234"));
        System.out.println(isCorrectNumberFormat("-1234"));
        System.out.println();
        System.out.println(isCorrectNumberFormat("1234,-1234"));
        System.out.println(isCorrectNumberFormat("1234,123,12"));
        System.out.println(isCorrectNumberFormat("1234a1234"));
        System.out.println(isCorrectNumberFormat(",1234"));
        System.out.println(isCorrectNumberFormat("1234,"));
        System.out.println(isCorrectNumberFormat(","));
        System.out.println(isCorrectNumberFormat(""));
        System.out.println(isCorrectNumberFormat("a"));
    }

    private static boolean isCorrectNumberFormat(String number) {
        /*
        true:
        "1234,1234"
        "1234"
        "-1234"

        false:
        "1234a1234"
        ",1234"
        "1234,"
        ","
        ""
        "a"
         */
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        return pattern.matcher(number).matches();
    }
}
