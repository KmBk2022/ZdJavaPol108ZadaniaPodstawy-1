package pl.sdacademy.java.basic.exercises.day2;

public class Task15 {

    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};
        System.out.println(areEquals(firstArray, secondArray));

        String[] firstArray1 = {"Ala", "ma", "kot"};
        String[] secondArray1 = {"Ala", "ma", "kota"};
        System.out.println(areEquals(firstArray1, secondArray1));

        String[] firstArray2 = {"Ala", null, "kota"};
        String[] secondArray2 = {"Ala", "ma", "kota"};
        System.out.println(areEquals(firstArray2, secondArray2));

        String[] firstArray3 = {"Ala", "ma", "kota"};
        String[] secondArray3 = {"Ala", null, "kota"};
        System.out.println(areEquals(firstArray3, secondArray3));

        String[] firstArray4 = {"Ala", null, "kota"};
        String[] secondArray4 = {"Ala", null, "kota"};
        System.out.println(areEquals(firstArray4, secondArray4));
    }

    private static boolean areEquals(String[] firstArray, String[] secondArray) {
        if(firstArray.length == secondArray.length) {
            for(int i = 0; i < firstArray.length; i++) {
                String firstArrElement = firstArray[i];
                String secondArrElement = secondArray[i];
                if(firstArrElement == null && secondArrElement == null) {
                    continue;
                }
                if((firstArrElement != null && (!firstArrElement.equals(secondArrElement)))
                        || firstArrElement == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
