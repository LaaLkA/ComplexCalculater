package Core;

public interface Calculable {
    void subtract(ComplexNumber number1, ComplexNumber number2);
    void sum(ComplexNumber number1, ComplexNumber number2);
    void multiply(ComplexNumber number1, ComplexNumber number2);
    void divide(ComplexNumber number1, ComplexNumber number2);
    ComplexNumber result();
    void clear();
}
