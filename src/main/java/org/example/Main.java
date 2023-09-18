package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RomanCalcs roman = new RomanCalcs();
        ArabicCalcs arabic= new ArabicCalcs();

        System.out.print("Введите выражение (не более 2-х чисел): ");
        String expression = scanner.nextLine();
        String[] operands = expression.split("[+\\-*/]");

        System.out.println(arabic.calculationsOfArabicNumbers(operands, expression));
        System.out.println(roman.calculationsOfRomanNumbers(operands,expression));
    }
}