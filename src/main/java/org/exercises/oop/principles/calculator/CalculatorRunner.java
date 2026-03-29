package org.exercises.oop.principles.calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.multiply(100, 500);
        calc.multiply(10, 5.5);
        calc.multiply(2.2, 2.4);
    }
}