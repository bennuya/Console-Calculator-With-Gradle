package ch.bbw.ceur.console_calculator;

/*
CalculatorTest Class
@author celina urwank
@version 16.11.2018
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    Calculator testE;

    /*
    ========================
    ===== TEST METHODS =====
    ========================
     */


    // initializes a calculator object before tests even start
    @Before
    public void initializeCalculator() throws Exception {
        testE = new Calculator();
    }


    // addition methods
    @Test
    public void testPositiveAddition() {
        assertTrue(testE.addition(10, 25) == 35);
    }

    @Test
    public void testNegativeAddition() {
        assertTrue(testE.addition(-10, -25) == -35);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testPositiveMaxValueAdditionThrowsException() {
        assertTrue(testE.addition(Integer.MAX_VALUE, 10) != 0);
    }

    @Test
    public void testEqualsMinValueAddition() {
        assertEquals(testE.addition(Integer.MIN_VALUE, 10), Integer.MIN_VALUE + 10);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testEqualsPositiveMinValueAddition() {
        assertEquals(testE.addition(Integer.MIN_VALUE, -10), Integer.MIN_VALUE + -10);
    }

    @Test
    public void testEqualsNegativeMinValueAddition() throws java.lang.ArithmeticException {
        assertEquals(testE.addition(-Integer.MIN_VALUE, 10), -Integer.MIN_VALUE + 10);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testEqualsNegativeNegativeMinValueAddition() {
        assertEquals(testE.addition(-Integer.MIN_VALUE, -10), -Integer.MIN_VALUE + -10);
    }

    @Test
    public void testEqualsZeroValueAddition() {
        assertEquals(testE.addition(0, 60), 0 + 60);
    }


    // subtraction methods
    @Test
    public void testPositiveSubtraction() {
        assertTrue(testE.subtraction(10, 5) == 5);
    }

    @Test
    public void testNegativeSubtraction() {
        assertTrue(testE.subtraction(-10, -5) == -5);
    }

    @Test
    public void testPositiveMaxValueSubtractionThrowsException() {
        assertTrue(testE.subtraction(Integer.MAX_VALUE, 10) != 0);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testEqualsMinValueSubtraction() {
        assertEquals(testE.subtraction(Integer.MIN_VALUE, 10), Integer.MIN_VALUE - 10);
    }

    @Test
    public void testEqualsPositiveMinValueSubtraction() {
        assertEquals(testE.subtraction(Integer.MIN_VALUE, -10), Integer.MIN_VALUE - -10);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testEqualsNegativeMinValueSubtraction() throws java.lang.ArithmeticException {
        assertEquals(testE.subtraction(-Integer.MIN_VALUE, 10), -Integer.MIN_VALUE - 10);
    }

    @Test
    public void testEqualsNegativeNegativeMinValueSubtraction() {
        assertEquals(testE.subtraction(-Integer.MIN_VALUE, -10), -Integer.MIN_VALUE - -10);
    }

    @Test
    public void testEqualsZeroValueSubtraction() {
        assertEquals(testE.subtraction(0, 60), 0 - 60);
    }



    // multiplication methods
    @Test
    public void testPositiveMultiplication() {
        assertTrue(testE.multiply(10, 5) == 50);
    }

    @Test
    public void testNegativeMultiplication() {
        assertTrue(testE.multiply(-10, -5) == 50);
    }

    @Test
    public void testPositiveMaxValueMultiplicationThrowsException() {
        assertTrue(testE.multiply(Integer.MAX_VALUE, 10) != 0);
    }

    @Test
    public void testEqualsMinValueMultiplication() {
        assertEquals(testE.multiply(Integer.MIN_VALUE, 10), Integer.MIN_VALUE * 10);
    }

    @Test
    public void testEqualsPositiveMinValueMultiplication() {
        assertEquals(testE.multiply(Integer.MIN_VALUE, -10), Integer.MIN_VALUE * -10);
    }

    @Test
    public void testEqualsNegativeMinValueMultiplication() throws java.lang.ArithmeticException {
        assertEquals(testE.multiply(-Integer.MIN_VALUE, 10), -Integer.MIN_VALUE * 10);
    }

    @Test
    public void testEqualsNegativeNegativeMinValueMultiplication() {
        assertEquals(testE.multiply(-Integer.MIN_VALUE, -10), -Integer.MIN_VALUE * -10);
    }

    @Test
    public void testEqualsZeroValueMultiplication() {
        assertEquals(testE.multiply(0, 60), 0 * 60);
    }


    // converter methods
    @Test
    public void testPositiveConvert() {
        testE = new Calculator();
        assertTrue(testE.converterToHex(10).equals("a"));
    }

    @Test
    public void testNegativeConvert() {
        testE = new Calculator();
        assertTrue(testE.converterToHex(-10).equals("fffffff6"));
    }

    @Test
    public void testFalseConvert() {
        assertFalse(testE.converterToHex(16).equals("adfgtr"));
    }

}