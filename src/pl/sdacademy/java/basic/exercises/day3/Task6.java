package pl.sdacademy.java.basic.exercises.day3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task6 {
    private static final String INPUT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert date in format [" + INPUT_DATE_FORMAT + "]: ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(INPUT_DATE_FORMAT);
        LocalDateTime nextLesson = LocalDateTime.parse(input, formatter);

        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, nextLesson);
        long days = Duration.between(now, nextLesson).toDays();
        System.out.println("You have " + days + " days to the next lesson");
        System.out.printf("You have %01d days to the next lesson\n", days);

        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        System.out.printf("You have days: %01d and hours: %01d and minutes: %01d and secs: %01d to the next lesson.", days, hours, minutes, seconds);
    }
}
