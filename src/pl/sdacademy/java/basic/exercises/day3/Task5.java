package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        stoper();
    }

    private static void stoper() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("To start timing press ENTER");
        scanner.nextLine();
        LocalTime startTime = LocalTime.now();

        System.out.print("To stop timing press ENTER");
        scanner.nextLine();
        LocalTime stopTime = LocalTime.now();

        long seconds = Duration.between(startTime, stopTime).getSeconds();
        System.out.println("Total time: " + seconds + " sec.");
    }
}
