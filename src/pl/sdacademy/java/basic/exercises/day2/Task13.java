package pl.sdacademy.java.basic.exercises.day2;

public class Task13 {

    public static void main(String[] args) {
        int[] inputs = {12, 7, 19, 2};
        System.out.println(getMinValue(inputs));
        System.out.println(getMaxValue(inputs));
        System.out.println(sum(inputs));
    }

    private static int getMinValue(int[] inputs) {
        int minValue = inputs[0]; // 12
        for(int element : inputs) { // 12 | 7 | 19
            if(element < minValue) { // 12 < 12 | 7 < 12 | 19 < 7
                minValue = element; // NA | 7 | NA
            }
        }
        return minValue;
    }

    private static int getMaxValue(int[] inputs) {
        int maxValue = inputs[0];
        for(int element : inputs) {
            if(element > maxValue) {
                maxValue = element;
            }
        }
        return maxValue;
    }

    private static int sum(int[] inputs) {
        int sum = 0;
        for(int i : inputs) {
            sum += i;
        }
//        for(int i = 0; i < inputs.length; i++) {
//            sum += inputs[i];
//        }
        return sum;
    }
}
