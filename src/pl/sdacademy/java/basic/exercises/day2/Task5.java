package pl.sdacademy.java.basic.exercises.day2;

public class Task5 {

    public static void main(String[] args) {
        String input = "Ala ma kotaa";
        char c = 'a';
        System.out.println(countCharInString(input, c));
    }

    private static int countCharInString(String input, char searchedChar) {
        int counter = 0;
        if(StringHelper.isValid(input) && input.contains(String.valueOf(searchedChar))) {
            for(int i = input.indexOf(searchedChar); i < input.length(); i++) {
                if(input.charAt(i) == searchedChar) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
