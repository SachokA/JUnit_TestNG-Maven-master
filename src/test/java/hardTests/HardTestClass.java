package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

    Calculator calc = new Calculator();


    @Test
    public void testAddParametrs() {
        int actualResult = calc.addParametrs(20, 32);
        assertEquals("Sum 20 and 32", 52, actualResult);
    }

    @Test
    public void testDivisionTwoPositiveValuesByZero() {
        int actualResult = calc.divisionByZero(10, 0);
        assertEquals("10 / 0 must be impossible", -100, actualResult);
    }
    //TODO (**)
    //add tests for new method - divide by zero case

    //TODO (**)
    //add tests for new method - addition with multiple parameters


}
