package ru.skypro.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.skypro.calculator.CalculatorTestConstants.FIRST_ARGUMENT;
import static ru.skypro.calculator.CalculatorTestConstants.THIRD_ARGUMENT;

public class CalculatorTest {
    private static final int TWO_ARGUMENT = 5;
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnResultOfSum() {
        Assertions.assertEquals(THIRD_ARGUMENT, out.plus(FIRST_ARGUMENT, TWO_ARGUMENT));
    }
    @Test
    public void shouldReturnResultOfMinus() {
        Assertions.assertEquals(THIRD_ARGUMENT, out.minus(FIRST_ARGUMENT, TWO_ARGUMENT));
    }
    @Test
    public void shouldReturnResultOfMultiple() {
        Assertions.assertEquals(THIRD_ARGUMENT, out.multiply(FIRST_ARGUMENT, TWO_ARGUMENT));
    }
    @Test
    public void shouldReturnResultOfDivide() {
        Assertions.assertEquals(THIRD_ARGUMENT, out.divide(FIRST_ARGUMENT, TWO_ARGUMENT));
    }
    @Test
    public void shouldReturnResultOfDivideWithZero() {
        Assertions.assertEquals(THIRD_ARGUMENT, out.minus(FIRST_ARGUMENT, TWO_ARGUMENT));
    }

}
