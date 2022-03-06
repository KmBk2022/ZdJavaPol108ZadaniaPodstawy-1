package pl.sdacademy.java.basic.exercises.day2;

public class Task11 {

    public static void main(String[] args) {
//        System.out.println(isPalindrome("kajak"));
//        System.out.println(isPalindrome("sedes"));
//        System.out.println(isPalindrome("programowanie"));

        System.out.println(isPalindromeV2("kajak"));
        System.out.println(isPalindromeV2("sedes"));
        System.out.println(isPalindromeV2("programowanie"));
    }

    private static boolean isPalindromeV2(String input) {
        String afterReverse = new StringBuilder(input).reverse().toString();
        return input.equals(afterReverse);
    }

    private static boolean isPalindrome(String input) {
        if(StringHelper.isValid(input)) {
            int forward = 0;
            int backward = input.length() - 1;
            while(backward > forward) {
                char forwardChar = input.charAt(forward);
                char backwardChar = input.charAt(backward);
                if(forwardChar != backwardChar) {
                    return false;
                }
                forward++;
                backward--;
            }
            return true;
        }
        return false;
    }
}
