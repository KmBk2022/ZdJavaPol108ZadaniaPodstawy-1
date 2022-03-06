package pl.sdacademy.java.basic.exercises.day2;

public class Task2 {

    public static void main(String[] args) {
        String prefix = "pro";
        String input = "programowanie";
        System.out.println("Prefix: " + prefix);
        System.out.println("Input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input, prefix));

        prefix = "nie";
        input = "";
        System.out.println("Prefix: " + prefix);
        System.out.println("Input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input, prefix));

        prefix = "nie";
        input = null;
        System.out.println("Prefix: " + prefix);
        System.out.println("Input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input, prefix));

        prefix = null;
        input = "programowanie";
        System.out.println("Prefix: " + prefix);
        System.out.println("Input: " + input);
        System.out.println("Result: " + isWordContainsPrefix(input, prefix));
    }

    private static boolean isWordContainsPrefix(String input, String prefix) {
//        if(input != null && !input.isBlank() && prefix != null && !prefix.isBlank()) {
        if(StringHelper.isValid(input) && StringHelper.isValid(prefix)) {
            return input.startsWith(prefix);
        }
        return false;
//        return isValid(input) && isValid(prefix) ? input.startsWith(prefix) : false;
    }
}
