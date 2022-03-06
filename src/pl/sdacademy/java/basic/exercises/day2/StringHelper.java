package pl.sdacademy.java.basic.exercises.day2;

public class StringHelper {

    public static boolean isValid(String input) {
        // operator trójargumentowy
        // logika (zwracam true albo false) ? operacja_gdy_true : operacja_gdy_false
        //int tmp = input != null ? 0 : 1;
        //return input != null ? fun1() : fun2();
        return input != null && !input.isBlank();
    }
}
