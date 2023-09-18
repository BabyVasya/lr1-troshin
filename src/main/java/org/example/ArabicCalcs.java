package org.example;

public class ArabicCalcs extends Calculations{

    //Результирующая функция
    public int calculationsOfArabicNumbers(String[] operands, String typeOfOpFromExpression) {
        NumberIdentifier n = new NumberIdentifier();
        n.validationOfComingData(operands, typeOfOpFromExpression);
        Calculations c = new Calculations();
        return c.makingPointedOperationWithInts(Integer.parseInt(operands[0]), Integer.parseInt(operands[1]), typeOfOpFromExpression);
    };
}
