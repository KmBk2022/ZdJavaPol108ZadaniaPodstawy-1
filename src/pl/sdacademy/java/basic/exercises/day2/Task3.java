package pl.sdacademy.java.basic.exercises.day2;

public class Task3 {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input, word));

        input = "Ala ma kota";
        word = "";
        System.out.println("Input: " + input);
        System.out.println("Word: " + word);
        System.out.println("Result: " + getIndex(input, word));
    }

    private static int getIndex(String input, String word) {
        if(StringHelper.isValid(input) && StringHelper.isValid(word)) {
//            boolean contains = input.contains(word);
//            if(contains) {
//                return input.indexOf(word);
//            } else {
//                return -1;
//            }
            return input.contains(word) ? input.indexOf(word) : -1;
        }
        return -1;
    }
}
