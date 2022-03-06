package pl.sdacademy.java.basic.exercises.day2;

public class Task7 {
    private static final char SPACE_SIGN = ' ';

    public static void main(String[] args) {
        String input = "Ala ma kota";
        System.out.println(calculatePercentOfSpaces(input));
    }

    private static double calculatePercentOfSpaces(String input) {
        if(StringHelper.isValid(input) && input.contains(String.valueOf(SPACE_SIGN))) {
        //if(input != null && input.contains(String.valueOf(SPACE_SIGN))) { // gdy same spacje mają dać wynik 100%
            double spacesCounter = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == SPACE_SIGN) {
                    spacesCounter++;
                }
            }
            return (spacesCounter / input.length()) * 100;
        }
        return 0;
    }
}
