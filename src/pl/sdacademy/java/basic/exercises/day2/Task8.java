package pl.sdacademy.java.basic.exercises.day2;

public class Task8 {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    private static final int DIFF_UPPER_AND_LOWER = 32;

    public static void main(String[] args) {
        String input = "Ala mA kOta!";
        System.out.println("Input: " + input);
        System.out.println("Result: " + replaceChars(input));

        input = "AlaMaKota";
        System.out.println("\nInput: " + input);
        System.out.println("Result: " + replaceChars(input));
    }

    private static String replaceChars(String input) {
        if(StringHelper.isValid(input)) {
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if(currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII) {
                    result.append((char) (currentChar + DIFF_UPPER_AND_LOWER));
                } else if(currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII) {
                    result.append((char) (currentChar - DIFF_UPPER_AND_LOWER));
                } else {
                    result.append(currentChar);
                }
            }
            return result.toString();
        }
        return input;
    }
}