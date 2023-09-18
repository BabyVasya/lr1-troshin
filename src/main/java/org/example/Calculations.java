package org.example;

public class Calculations {

    public int addition(int a, int b) {
        return a+b;
    };
    public int subtraction(int a, int b) {
        return a-b;
    };
    public int multiplication(int a, int b) {
        return a*b;
    };
    public int division(int a, int b) {
        return a/b;
    };


    public int makingPointedOperationWithInts(int num1, int num2, String typeOfOp) {
        if(typeOfOp.contains("+")) return addition(num1, num2);
        if(typeOfOp.contains("-")) return subtraction(num1, num2);
        if(typeOfOp.contains("*")) return multiplication(num1, num2);
        if(typeOfOp.contains("/")) return division(num1, num2);
        else throw new RuntimeException("Такой операции не предусмотрено");
    };

}
