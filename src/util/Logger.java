package util;

import Core.Calculable;
import Core.ComplexNumber;

public class Logger implements Calculable {
    public Calculable calculator;

    public Logger(Calculable calculator) {
        this.calculator = calculator;
    }

    @Override
    public void subtract(ComplexNumber number1, ComplexNumber number2) {
        System.err.printf("\tLogging: Subtraction - %s, %s", number1, number2);
        calculator.subtract(number1, number2);
        System.err.printf("\n\tLogging: Operation result - %s", result());

    }

    @Override
    public void sum(ComplexNumber number1, ComplexNumber number2) {
        System.err.printf("\tLogging: Summation - %s, %s", number1, number2);
        calculator.sum(number1, number2);
        System.err.printf("\n\tLogging: Operation result - %s", result());
    }

    @Override
    public void multiply(ComplexNumber number1, ComplexNumber number2) {
        System.err.printf("\tLogging: Multiplication n - %s, %s", number1, number2);
        calculator.multiply(number1, number2);
        System.err.printf("\n\tLogging: Operation result - %s", result());
    }

    @Override
    public void divide(ComplexNumber number1, ComplexNumber number2) {
        System.err.printf("\tLogging: Divide - %s, %s", number1, number2);
        calculator.divide(number1, number2);
        System.err.printf("\n\tLogging: Operation result - %s", result());
    }

    @Override
    public ComplexNumber result() {
        return calculator.result();
    }

    @Override
    public void clear() {
        calculator.clear();
    }
}
