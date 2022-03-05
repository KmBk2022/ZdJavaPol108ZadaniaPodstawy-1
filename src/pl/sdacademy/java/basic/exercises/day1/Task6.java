package pl.sdacademy.java.basic.exercises.day1;

public class Task6 {

    public static void main(String[] args) {
        printMultiplicationTable(6, 2, 5);
    }

    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMultiplicand) {
//        for(int i = minMultiplicand; i <= maxMultiplicand; i++) {
//            // 6 * 2 = 12
//            // 6 * 3 = 18
//            // 6 * 4 = 24
//            int result = multiplier * i;
//            System.out.println(multiplier + " * " + i + " = " + result);
//        }
        while(minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }
}
