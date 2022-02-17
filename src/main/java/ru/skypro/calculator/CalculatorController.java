package ru.skypro.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService num1;
    private final CalculatorService num2;

    public CalculatorController(CalculatorService num1, CalculatorService num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "plus")
    public int plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + calculatorService.getNum2() = calculatorService.plus();
    }

    @GetMapping(path = "/minus")
    public int minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.getNum1() + calculatorService.getNum2() = calculatorService.minus();
    }
    @GetMapping(path = "/multiply")
    public int multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.getNum1() + calculatorService.getNum2() = calculatorService.multiply();
    }

    @GetMapping(path = "/divide")
    public int divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.getNum1() + calculatorService.getNum2() = calculatorService.divide();
    }

}
