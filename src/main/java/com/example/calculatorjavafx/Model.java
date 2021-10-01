package com.example.calculatorjavafx;

public class Model {
    public float calculate(double firstNumber, double secondNumber, String operator) {
        switch (operator){
            case "+":
                return (float) (firstNumber + secondNumber);
            case ",":
                return (float) firstNumber;
            case "-":
                return (float) (firstNumber - secondNumber);
            case "*":
                return (float) (firstNumber * secondNumber);
            case "/":
                if (secondNumber == 0)
                    return 0;
                return (float) (firstNumber / secondNumber);
            case "CLEAR":
                return 0;
            default:
                return 0;
        }
    }
}