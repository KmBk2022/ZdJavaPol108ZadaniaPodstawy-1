package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task7 {
    private static final String STOP_DECISION = "Stop";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decision;
        do {
            System.out.print("Please insert first digit: ");
            float firstDigit = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("Please insert operator (+ - / *): ");
            String operator = scanner.nextLine();

            System.out.print("Please insert second digit: ");
            float secondDigit = scanner.nextFloat();
            scanner.nextLine();

            float result = calculate(firstDigit, secondDigit, operator);
            System.out.println("Result: " + result);

            System.out.print("New calculation or Stop? ");
            decision = scanner.nextLine();
        } while(!STOP_DECISION.equals(decision));
    }

    private static float calculate(float firstDigit, float secondDigit, String operator) {
        float result = 0;
        switch(operator) {
            case "+":
                //return firstDigit + secondDigit;
                result = firstDigit + secondDigit;
                break;
            case "-":
                result = firstDigit - secondDigit;
                break;
            case "*":
                result = firstDigit * secondDigit;
                break;
            case "/":
                if(secondDigit == 0) {
                    System.out.println("Wrong operation");
                    System.exit(1);
                }
                result = firstDigit / secondDigit;
                break;
            default:
                System.out.println("Operator not exist");
                System.exit(1);
        }
        return result;
    }
}
