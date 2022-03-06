package pl.sdacademy.java.basic.exercises.day1;

public class Task8 {

    public static void main(String[] args) {
        int rangeFrom = 0;
        int rangeTo = 10;
        System.out.printf("Range from %s to %s\n", rangeFrom, rangeTo);
        System.out.println("Prime numbers: ");
        for (int i = rangeFrom; i <= rangeTo; i++) {
            if(isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        // liczba pierwsza to liczba większa od jedynki, więc wszystko co mniejsze od 2 -> retrun false
        if(number < 2) {
            return false;
        }

        //#1 option
        for(int i = 2; i <= number/2; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;

        //#2 option
        /*int i = 2;
        while(i <= number/2)
        {
            if(number%i == 0)
            {
                return false;
            }
            ++i;
        }
        return true;*/
    }
}