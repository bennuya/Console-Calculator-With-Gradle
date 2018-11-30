/*
CalculatorTest Class
@author celina urwank
@version 16.11.2018
 */

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    Calculator testE;

    @Test
    public void testPositive() {
        testE = new Calculator();
        assertTrue(testE.addition(10, 25) == 35);
    }

    @Test
    public void testNegative() {
        testE = new Calculator();
        assertFalse(testE.addition(10, 25) == 35);
    }

    @Test
    public void testNull() {
        testE = new Calculator();
        assertNull(testE.addition(10, 25) == 35);
    }

}