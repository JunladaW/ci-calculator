package com.example.junlada.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTest {
    private int number1;
    private int number2;
    private int expectedResult;

    public CalculatorTest(int number1, int number2, int expectedResult) {
        this.number1 = number1;
        this.number2 = number2;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static List<Object[]> init() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {0, 5, 5},
                {-1,2 ,1},
        });
    }

    @Test
    public void plus_isCorrect() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.plus(number1, number2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    // @Ignore >> ไม่รันเทสนี้
    public void minus_isCorrect() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.minus(3, 4);
        assertEquals(-1, actualResult);
    }
}