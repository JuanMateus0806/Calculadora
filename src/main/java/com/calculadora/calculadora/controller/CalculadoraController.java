package com.calculadora.calculadora.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.calculadora.services.CalculadoraService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/division")
    public double getDivision(@RequestParam int divisor,@RequestParam int dividendo) {
        return calculadoraService.division(divisor, dividendo);
    }

    @GetMapping("/suma")
    public double getSuma(@RequestParam int number1,@RequestParam int number2) {
        return calculadoraService.suma(number1, number2);
    }

    @GetMapping("/resta")
    public double getResta(@RequestParam int number1,@RequestParam int number2) {
        return calculadoraService.resta(number1, number2);
    }
    
    @GetMapping("/multiplicacion")
    public double getMultiplicacion(@RequestParam int number1,@RequestParam int number2) {
        return calculadoraService.multiplicacion(number1, number2);
    }

    @GetMapping("/raizCuadrada")
    public double getRaizCuadrada(@RequestParam int number) {
        return calculadoraService.raizCuadrada(number);
    }

    @GetMapping("/logaritmoBase10")
    public double getLogaritmaBase10(@RequestParam int number) {
        return calculadoraService.logaritmoBase10(number);
    }
    
}