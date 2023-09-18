package org.example;

import java.util.Arrays;

public class ArabicCalcs extends Calculations{

    //Результирующая функция
    public int calculationsOfArabicNumbers(String[] operands, String typeOfOpFromExpression) {
        Calculations c = new Calculations();
        return c.makingPointedOperationWithInts(Integer.parseInt(operands[0]), Integer.parseInt(operands[1]), typeOfOpFromExpression);
    };
}
