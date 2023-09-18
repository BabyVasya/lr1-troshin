package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberIdentifier n = new NumberIdentifier();
        System.out.print("Введите выражение (не более 2-х чисел): ");
        String expression = scanner.nextLine();
        String[] operands = expression.split("[+\\-*/]");

        n.validationOfComingData(operands, expression);
    }
}