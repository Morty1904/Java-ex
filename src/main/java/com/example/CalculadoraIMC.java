package com.example;

public class CalculadoraIMC {
    private double peso;
    private double estatura;

    public CalculadoraIMC(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }

    public double calcularIMC() {
        return peso / (estatura * estatura);
    }

    public String clasificarIMC(double imc) {
        if (imc < 18.5) {
            return "Peso inferior al normal";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Peso superior al normal";
        } else {
            return "Obesidad";
        }
    }
}