package ru.skypro.calculator;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

    int plus(int num1, int num2);
    int minus(int num1, int num2);
    int multiply(int num1, int num2);
    int divide(int num1, int num2);
    int sum(int num1, int num2);
    int getNum1(int num1, int num2);
    int getNum2(int num1, int num2);
    int setNum1(int num1, int num2);
    int setNum2(int num1, int num2);




}
