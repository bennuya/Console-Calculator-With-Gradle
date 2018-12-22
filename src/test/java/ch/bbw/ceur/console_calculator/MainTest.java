package ch.bbw.ceur.console_calculator;

/*
MainTest Class
@author celina urwank
@version 22.12.2018
 */

import junit.framework.TestCase;

import junit.framework.Test;
import junit.framework.TestSuite;

public class MainTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MainTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(MainTest.class);
    }

    /**
     * Rigourous Test
     */
    public void testApp() {
        assertTrue(true);
    }

}
