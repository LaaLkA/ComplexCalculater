package Core;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;
    private double denominator;

    public ComplexNumber(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart(){
        return realPart;
    }

    public double getImaginaryPart(){
        return imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public double getDenominator() {
        return realPart * realPart + imaginaryPart * imaginaryPart;
    }

    @Override
    public String toString() {
        return String.format("real part: %s, imaginary part: %s",realPart, imaginaryPart);
    }
}
