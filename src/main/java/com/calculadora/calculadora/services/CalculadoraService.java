package com.calculadora.calculadora.services;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service()
public class CalculadoraService {

    private static final Logger logger = LoggerFactory.getLogger(CalculadoraService.class);
    
    public double division(int divisor,int dividendo){
        logger.info("Division: valores recibidos -> divisor: " + divisor +", dividendo: " + dividendo );
        return dividendo/divisor;
    }

    public double raizCuadrada(int number){
        logger.info("Raiz cuadrada: Valor recibido -> "+number);
        return Math.sqrt(number);
    }

    public double suma(int number1,int  number2){
        logger.info("Suma: Valores recibidos -> "+number1+" " + number2);
        return number1+number2;
    }

    public double resta(int number1,int  number2){
        logger.info("Resta: Valores recibidos -> "+number1+" " + number2);
        return number1-number2;
    }

    public double multiplicacion(int number1,int  number2){
        logger.info("Multiplicacion: Valores recibidos -> "+number1+" " + number2);
        return number1*number2;
    }

    public double logaritmoBase10(int number){
        logger.info("Logaritmo en base 10: Valor recibidos -> " + number);
        return Math.log10(number);
    }

}