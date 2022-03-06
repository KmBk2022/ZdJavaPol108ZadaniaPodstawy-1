package pl.sdacademy.java.basic.exercises.day2;

public class Task1 {
    private static final char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {
        String input = "domek   ";
        char result = getLastChar(input);
        System.out.println("Original char: " + input);
        System.out.println("Last char: " + result);

        input = null;
        result = getLastChar(input);
        System.out.println("Original char: " + input);
        System.out.println("Last char: " + result);

        input = "  ";
        result = getLastChar(input);
        System.out.println("Original char: " + input);
        System.out.println("Last char: " + result);
    }

    private static char getLastChar(String input) {
        if(input != null && !input.isBlank()) {
            String inputWithoutTrim = input.trim();
            int lastPosition = inputWithoutTrim.length() - 1;
            return inputWithoutTrim.charAt(lastPosition);
        }
        return DEFAULT_CHAR;
    }
}
