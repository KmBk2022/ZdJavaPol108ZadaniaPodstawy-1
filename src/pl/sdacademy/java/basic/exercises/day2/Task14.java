package pl.sdacademy.java.basic.exercises.day2;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        int lengthOfNewArray = countNegativeValuesInArray(inputs);
        if(lengthOfNewArray > 0) {
            int[] onlyNegativeValues = createArrayWithOnlyNegativeValues(inputs, lengthOfNewArray);
            System.out.println(Arrays.toString(onlyNegativeValues));
        }
    }

    private static int[] createArrayWithOnlyNegativeValues(int[] inputs, int lengthOfNewArray) {
        int[] result = new int[lengthOfNewArray];
//        int i = 0;
//        for(int element : inputs) {
//            if(element < 0) {
//                result[i] = element;
//                i++;
//            }
//        }
        //{12, -7, 19, -5}
        for(int i = 0, j = 0; i < inputs.length; i++) {
            if(inputs[i] < 0) {
                result[j] = inputs[i];
                j++;
            }
        }
        return result;
    }

    private static int countNegativeValuesInArray(int[] inputs) {
        int counter = 0;
        for(int element : inputs) {
            if(element < 0) {
                counter++;
            }
        }
        return counter;
    }
}
