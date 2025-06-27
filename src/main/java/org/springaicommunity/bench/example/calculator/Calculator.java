package org.springaicommunity.bench.example.calculator;

/**
 * A simple calculator class supporting basic arithmetic operations.
 */
public class Calculator {
    
    /**
     * Adds two numbers.
     */
    public double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtracts b from a.
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplies two numbers.
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Divides a by b.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    
    /**
     * Calculates the square root of a number.
     * BUG: Doesn't handle negative numbers - should throw exception
     */
    public double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }
}
