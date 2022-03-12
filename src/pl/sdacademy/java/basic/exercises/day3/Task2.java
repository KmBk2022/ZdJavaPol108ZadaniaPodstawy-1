package pl.sdacademy.java.basic.exercises.day3;

import java.util.regex.Pattern;

public class Task2 {
    private static final String PL_IBAN_REGEX = "PL[0-9]{26}"; // gdy PL lub pl to wtedy (PL|pl)

    public static void main(String[] args) {
        System.out.println(isCorrectPlIbanFormat("PL10105000997603123456789123"));
        System.out.println();
        System.out.println(isCorrectPlIbanFormat("P10105000997603123456789123"));
        System.out.println(isCorrectPlIbanFormat("10105000997603123456789123"));
        System.out.println(isCorrectPlIbanFormat("PL123"));
        System.out.println(isCorrectPlIbanFormat("PL101050009976031234567891230"));
        System.out.println(isCorrectPlIbanFormat("pl10105000997603123456789123"));
    }

    private static boolean isCorrectPlIbanFormat(String iban) {
        /*
        true:
        PL10105000997603123456789123

        false:
        P10105000997603123456789123
        10105000997603123456789123
        PL123
        PL101050009976031234567891230
        pl10105000997603123456789123
         */
        Pattern pattern = Pattern.compile(PL_IBAN_REGEX);
        return pattern.matcher(iban).matches();
    }
}
