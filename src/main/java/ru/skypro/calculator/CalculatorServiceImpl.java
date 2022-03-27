package ru.skypro.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private int num1;
    private int num2;

    public CalculatorServiceImpl(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void plus(int num1, int num2) {
        int result = num1 + num2;
    }


    public void minus(int num1, int num2) {
        int result = num1 - num2;
    }

    public void multiply(float num1, float num2) {
        float result = num1 * num2;
    }


    public void divide(float num1, float num2) {
        if(num2 == 0 ) {
            System.out.println("Ошибка");
        } else {
            float result = num1 / num2;
        }

    }
}
