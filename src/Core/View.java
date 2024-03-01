package Core;

import util.Operators;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class View {
    private final Calculable calculator;
    private final List<String> validOperators;


    public View(Calculable calculator) {
        this.calculator = calculator;
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator).collect(Collectors.toList());
    }

    public void run() {
        while (true) {
            prepare();
            String action = prompt();
            if (!action.equalsIgnoreCase("y")){
                System.exit(0);
            }
        }
    }

    private void prepare() {
        ComplexNumber number1 = new ComplexNumber(promptInt("Enter real part first argument: "), promptInt("Enter imaginary part first argument: "));
        String operator = getOperator();
        ComplexNumber number2 = new ComplexNumber(promptInt("Enter real part second argument: "), promptInt("Enter imaginary part second argument: "));

//        switch (operator) {
//            case "+":
//                calculator.sum(number1, number2);
//                calculator.result();
//
//            case "-":
//                calculator.divide(number1,number2);
//                calculator.result();
//                calculator.clear();
//            case "*":
//                calculator.multiply(number1,number2);
//                calculator.result();
//                calculator.clear();
//            case "/":
//                calculator.subtract(number1, number2);
//                calculator.result();
//                calculator.clear();
//        }
        if (operator.equals("*")) calculator.multiply(number1, number2);

        if (operator.equals("+")) calculator.sum(number1, number2);

        if (operator.equals("/")) calculator.divide(number1, number2);

        if (operator.equals("-")) calculator.subtract(number1, number2);

//        calculator.result();
        calculator.clear();
    }

    private double promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        int result = -1;
        try {
            result = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("The number is entered incorrectly! Please, repeat enter number");
            promptInt(message);
        }
        return (double) result;
    }

    private String getOperator() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter current operation (+, -, *, /): ");
        String operation = in.nextLine();
        while(true) {
            if (isInvalidOperator(operation)) {
                System.err.println("Entered invalid operator." + "Enter current operation (+, -, *, /): ");
                operation = in.nextLine();
            }return operation;
        }
    }

    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }

    private String prompt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Continue? (y/n)");
        return in.nextLine();
    }
}
