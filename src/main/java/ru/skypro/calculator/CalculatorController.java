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
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorServiceImpl num1, CalculatorServiceImpl num2, CalculatorService calculatorService) {
        this.num1 = num1;
        this.num2 = num2;
        this.calculatorService = calculatorService;
    }


    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "plus")
    public int plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + num2 +  calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public int minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + num2 +  calculatorService.minus(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public int multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + num2 + calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public int divide(@RequestParam("num1")int num1, @RequestParam("num2") int num2){
        return num1 + num2 +  calculatorService.divide(num1, num2);
    }
    @GetMapping(path = "/sum")
    public int sum(@RequestParam("num1")int num1, @RequestParam("num2") int num2){
        return num1 + num2 +  calculatorService.sum(num1, num2);
    }

}
