package ru.skypro.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.skypro.calculator.CalculatorTestConstants.*;

public class CalculatorTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnResultOfSum() {
        Assertions.assertEquals(FIRST_ARGUMENT, out.plus(THIRD_ARGUMENT, SECOND_ARGUMENT));
    }
    @Test
    public void shouldReturnResultOfMinus() {
        Assertions.assertEquals(SECOND_ARGUMENT, out.minus(THIRD_ARGUMENT, SECOND_ARGUMENT));
    }
    @Test
    public void shouldReturnResultOfMultiple() {
        Assertions.assertEquals(FIRST_ARGUMENT, out.multiply(FIRST_ARGUMENT, SECOND_ARGUMENT));
    }
    @Test
    public void shouldReturnResultOfDivide() {
        Assertions.assertEquals(FIRST_ARGUMENT, out.divide(FIRST_ARGUMENT, SECOND_ARGUMENT));
    }
    @Test
    public void shouldReturnResultOfDivideWithZero() {

//        Assertions.assertEquals(throw new RuntimeException(), out.minus(FIRST_ARGUMENT, THIRD_ARGUMENT));
        assertThrows(new RuntimeException("Делить на ноль нельзя"), () -> out.divide(FIRST_ARGUMENT,ZERO_ARGUMENT));
    }

}
