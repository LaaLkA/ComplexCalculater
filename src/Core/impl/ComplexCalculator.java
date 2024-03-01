package Core.impl;

import Core.Calculable;
import Core.ComplexNumber;


public class ComplexCalculator implements Calculable {
    public ComplexNumber result;

    @Override
    public void subtract(ComplexNumber number1, ComplexNumber number2) {
        double realPart = number1.getRealPart() - number2.getRealPart();
        double imaginaryPart = number1.getImaginaryPart() - number2.getImaginaryPart();
        result = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public void sum(ComplexNumber number1, ComplexNumber number2) {
        double realPart = number1.getRealPart() + number2.getRealPart();
        double imaginaryPart = number1.getImaginaryPart() + number2.getImaginaryPart();
        result = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public void multiply(ComplexNumber number1, ComplexNumber number2) {
        double realPart = number1.getRealPart() * number2.getRealPart() -
                number1.getImaginaryPart() * number2.getImaginaryPart();
        double imaginaryPart = number1.getRealPart() * number2.getImaginaryPart() +
                number1.getImaginaryPart() * number2.getRealPart();
        result = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public void divide(ComplexNumber number1, ComplexNumber number2) {
        double realPart = (number1.getRealPart() * number2.getRealPart() +
                number2.getImaginaryPart() * number2.getImaginaryPart()) / number2.getDenominator();
        double imaginaryPart = (number1.getImaginaryPart() * number2.getRealPart() -
                number1.getRealPart() * number2.getImaginaryPart()) / number1.getDenominator();
        result = new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber result() {
        System.out.printf("\nResult: %s%n", result);
        return result;
    }

    @Override
    public void clear() {
        result = new ComplexNumber(0, 0);
    }
}
