package ch.bbw.ceur.console_calculator;

/*
Main Class
@author celina urwank
@version 16.11.2018
 */

public class Main {
    public static void main (String[] args) {

        System.out.println("initializing new calculator object....");

        Calculator calculator = new Calculator();

        System.out.println("initializing values....");

        int num1 = 0;
        int num2 = 0;

        System.out.println("starting calculator....");

        num1 = 10;
        num2 = 25;

        System.out.println("calculating values....");

        System.out.println("********************************************");
        System.out.println("The Sum of " + num1 + " and " + num2 + " is equal to " + calculator.addition(num1, num2));
        System.out.println("The Difference of " + num1 + " and " + num2 + " is equal to " + calculator.subtraction(num1, num2));
        System.out.println("The Product of " + num1 + " and " + num2 + " is equal to " + calculator.multiply(num1, num2));
        System.out.println(+ num1 + " in Hex is equal to " + "\"" + calculator.converterToHex(num1) + "\"");
        System.out.println("********************************************");


    }
}
