package simpleTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test(groups = {"regression"})
    public void testAddTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void testSubtractionTwoPositiveValues() {
        int actualResult = calc.subtraction(10, 5);
        assertEquals("10 - 5 must be 5", 5, actualResult);
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
        assertEquals("Sguare 100 must be 10", 10.0, actualResult);
    }

    @Test
    public void testSquareTwoPositiveValues() {
        double actualResult = calc.theSquare(10);
        assertEquals("Квадрат 10 must be 100", 100.0, actualResult);
    }

}



