package mediumTests;

import application.Calculator;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MediumTestClass {

  Calculator calc = new Calculator();


    @Test(groups = {"Smoke"})
    public void testAverageValue() {
      double actualResult = calc.averageValue(20, 20, 50);
      assertEquals("Average value 20, 20, 50 must be 30", 30.0, actualResult);
    }

    @Test
    public void testEvenOdd() {
      boolean actualResult = calc.evenOdd(21);
      //assertEquals("The number 20 is even, so it should give out True", true, actualResult);
      assertEquals("The number 21 is odd, so it should give out False", false, actualResult);
    }

    @Test
    public void testBiggestValue() {
      int actualResult = calc.biggestValue(20, 32);
      assertEquals("32 > 20", 32, actualResult);
    }

  }
  //TODO (**)
  //add tests for new method - average value

  //TODO (**)
  //add tests for new method - even or odd

  //TODO (**)
  //add tests for new method - biggest value


