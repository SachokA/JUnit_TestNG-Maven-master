package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {
    // I'm trying to chance something

    Calculator calc = new Calculator();

    @Test(groups = {"regression"})
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void testSubtractionTwoPositiveValues() {
        // Changed number which will be subtraction
        int actualResult = calc.subtraction(22, 12);
        assertEquals("22 - 12 must be 10", 10, actualResult);
    }

    @Test
    public void testMultiplicationTwoPositiveValues() {
        int actualResult = calc.multiplication(10, 5);
        assertEquals("10 * 5 must be 50", 50, actualResult);
    }

    @Test
    public void testDivisionTwoPositiveValues() {
        int actualResult = calc.division(10, 5);
        assertEquals("10 / 5 must be 2", 2, actualResult);
    }

    @Test
    public void testSquareRootTwoPositiveValues() {
        double actualResult = calc.squareRoot(100);
        assertEquals("Square 100 must be 10", 10.0, actualResult);
    }

    @Test
    public void testSquareTwoPositiveValues() {
        double actualResult = calc.theSquare(10);
        assertEquals("Квадрат 10 must be 100", 100.0, actualResult);
    }

}



