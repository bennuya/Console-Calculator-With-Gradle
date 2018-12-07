/*
CalculatorTest Class
@author celina urwank
@version 16.11.2018
 */

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    Calculator testE;

    /*
    ========================
    ===== TEST METHODS =====
    ========================
     */

    // addition methods
    @Test
    public void testPositiveAdd() {
        testE = new Calculator();
        assertTrue(testE.addition(10, 25) == 35);
    }

    @Test
    public void testNegativeAdd() {
        testE = new Calculator();
        assertTrue(testE.addition(-10, -25) == -35);
    }

    // subtraction methods
    @Test
    public void testPositiveSub() {
        testE = new Calculator();
        assertTrue(testE.subtraction(10, 5) == 5);
    }

    @Test
    public void testNegativeSub() {
        testE = new Calculator();
        assertTrue(testE.subtraction(-10, -5) == -5);
    }

}