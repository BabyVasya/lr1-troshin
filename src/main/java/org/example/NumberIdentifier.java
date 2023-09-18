package org.example;

import java.util.Arrays;

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

    public boolean validationOfComingData( String [] operands, String typeOfOpFromExpression) {
        Calculations c = new Calculations();
        NumberIdentifier n = new NumberIdentifier();
        if(n.isRomanNumber(operands[0]) && n.isArabicNumber(operands[1])) throw new RuntimeException("Неверный формат чисел");
        if(n.isArabicNumber(operands[0]) && n.isRomanNumber(operands[1])) throw new RuntimeException("Неверный формат чисел");
        if(operands.length != 2) throw new RuntimeException("Должно быть два операнда, либо одно из веденных чисел отрицательное");
        if(Integer.parseInt(operands[0]) > 10 || Integer.parseInt(operands[1]) > 10) throw new RuntimeException("Числа не могут быть больше 10");
        if(Integer.parseInt(operands[0]) < 1 || Integer.parseInt(operands[1]) < 1) throw new RuntimeException("Числа должны быть от 1 до 10 и не могут быть отрицательными");
        return true;
    }
}



