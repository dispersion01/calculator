package ru.skypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private int num1;
    private int num2;
    public CalculatorServiceImpl() {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }


    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {

        return num1 * num2;
    }


    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно");
        }
        return num1 / num2;
    }


    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getNum1(int num1, int num2) {
        return num1;
    }

    @Override
    public int getNum2(int num1, int num2) {
        return num2;
    }

    @Override
    public int setNum1(int num1, int num2) {
        return num1;
    }

    @Override
    public int setNum2(int num1, int num2) {
        return num2;
    }


}
