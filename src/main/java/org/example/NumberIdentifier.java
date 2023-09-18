package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class NumberIdentifier {
    public String[] arabicArr = {"1","2","3","4","5","6","7","8","9","10"};
    public String[] romanArr = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
    public boolean isArabicNumber(String arabicNumber) {
        if(Arrays.asList(arabicArr).contains(arabicNumber)) return true;
        else return false;
    };

    public boolean isRomanNumber(String romanNumber) {
        if(Arrays.asList(romanArr).contains(romanNumber)) return true;
        else return false;
    };

    public void validationOfComingData( String [] operands, String expression) {
        NumberIdentifier n = new NumberIdentifier();
        RomanCalcs roman = new RomanCalcs();
        ArabicCalcs arabic= new ArabicCalcs();
        if(operands.length != 2) throw new RuntimeException("Должно быть два операнда, либо одно из веденных чисел отрицательное");
        if(n.isArabicNumber(operands[0]) && n.isArabicNumber(operands[1])) {
            System.out.println(arabic.calculationsOfArabicNumbers(operands, expression));
            return;
        }
        if(n.isRomanNumber(operands[0]) && n.isRomanNumber(operands[1])) {
            System.out.println(roman.calculationsOfRomanNumbers(operands,expression));
            return;
        } else throw new RuntimeException("Неверный формат чисел");
    }
}



