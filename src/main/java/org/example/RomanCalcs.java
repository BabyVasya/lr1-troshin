package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanCalcs extends Calculations {

    //Перевод из римских в арабские
    Map<Character, Integer> map = new HashMap<>();
    {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

    }
    public int romanToIntArab(String s) {

        int result=0;
        int prev =0;
        for(int i = s.length()-1; i>=0; i-- ) {
            int curr = map.get(s.charAt(i));
            if(curr < prev) { //IV
                result -= curr;
            } else {
                result +=curr;
            }
            prev=curr;
        }
        return result;

    };


//Перевод из арабских в римские
    private final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private final String[] SYMBOLS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public String intArabToRoman(int num) {
        if (num <= 0 || num > 3999) {
            throw new IllegalArgumentException("Число должно быть в диапазоне от 1 до 3999");
        }

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < VALUES.length; i++) {
            while (num >= VALUES[i]) {
                num -= VALUES[i];
                romanNumeral.append(SYMBOLS[i]);
            }
        }

        return romanNumeral.toString();
    }

//    ------------------------------------------------------------------------------------------------------------

 // результирующая функция
    public String calculationsOfRomanNumbers(String[] operands, String typeOfOpFromExpression) {
        NumberIdentifier n = new NumberIdentifier();
        if (!n.validationOfComingData(operands, typeOfOpFromExpression)) throw new RuntimeException("Ошибка валидации данных");
        RomanCalcs r = new RomanCalcs();
        Calculations c = new Calculations();
        int resultOfoperationInt = c.makingPointedOperationWithInts(r.romanToIntArab(operands[0]), r.romanToIntArab(operands[1]), typeOfOpFromExpression);
        return  r.intArabToRoman(resultOfoperationInt);
    };

}
