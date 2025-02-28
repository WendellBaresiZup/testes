package br.com.zup.calculadora.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double adicao(double a, double b){
        return a + b;
    }

    public double subtracao(double a, double b){
        return a - b;
    }

    public double multiplicacao(double a, double b){
        return a * b;
    }

    public double divisao(double a, double b) {
        return a / b;
    }
}
