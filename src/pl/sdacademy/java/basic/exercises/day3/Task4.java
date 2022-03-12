package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task4 {
    private static final String REGEX = "a+ psik";
    //private static final String REGEX = "a+ (psik|Psik)"; // gdybyśmy chcieli akceptować zarówno psik jak i Psik

    public static void main(String[] args) {
        System.out.println(isContainsAString("a psik"));
        System.out.println(isContainsAString("aaa psik"));
        System.out.println();
        System.out.println(isContainsAString("a Psik"));
        System.out.println(isContainsAString("aaapsik"));
        System.out.println(isContainsAString("psik"));
        System.out.println(isContainsAString(" psik"));
    }

    private static boolean isContainsAString(String input) {
        Pattern pattern = Pattern.compile(REGEX);
        return pattern.matcher(input).matches();
    }
}
