package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumference = calculateCircumferenceOfACircle(radius);
        float area = calculateAreaOfACircle(radius);
        System.out.println("Circumference Of A Circle: " + circumference);
        System.out.println("Area Of A Circle: " + area);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
/*        float diameter = scanner.nextFloat();
        return diameter;*/
        System.out.print("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float radius) {
        // 2 * pi * R
        // return 2 * 3.14F * diameter/2
        //return 2 * PI * radius;
        return 2 * (float) Math.PI * radius;
    }

    private static float calculateAreaOfACircle(float radius) {
        // PI * r^2
        //return PI * radius * radius;
        return (float) Math.PI * radius * radius;
    }
}
