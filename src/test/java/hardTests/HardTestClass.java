package hardTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HardTestClass {

    Calculator calc = new Calculator();


    @Test
    public void testAddParameters() {
        //I changed amount paramaters in the metod and result
        int actualResult = calc.addParameters(22,2,25);
        assertEquals("Sum 22 and 2 and 25", 49, actualResult);
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
