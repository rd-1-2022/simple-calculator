package org.springaicommunity.bench.example.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), 0.001);
        assertEquals(-1.0, calculator.add(2.0, -3.0), 0.001);
        assertEquals(0.0, calculator.add(0.0, 0.0), 0.001);
    }
    
    @Test
    void testSubtract() {
        assertEquals(-1.0, calculator.subtract(2.0, 3.0), 0.001);
        assertEquals(5.0, calculator.subtract(2.0, -3.0), 0.001);
        assertEquals(0.0, calculator.subtract(5.0, 5.0), 0.001);
    }
    
    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.001);
        assertEquals(-6.0, calculator.multiply(2.0, -3.0), 0.001);
        assertEquals(0.0, calculator.multiply(0.0, 5.0), 0.001);
    }
    
    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.001);
        assertEquals(-2.0, calculator.divide(6.0, -3.0), 0.001);
        assertEquals(0.0, calculator.divide(0.0, 5.0), 0.001);
        
        // Test division by zero throws exception
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5.0, 0.0));
    }
    
    @Test
    void sqrtNegativeThrows() {
        // This test will FAIL because the current sqrt implementation doesn't handle negative numbers
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-1));
    }
}
