package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraIMCTest {
    private CalculadoraIMC calculadora;

    @BeforeEach
    public void setup() {
        calculadora = new CalculadoraIMC(70, 1.75);
    }

    @Test
    public void testCalcularIMC() {
        double imc = calculadora.calcularIMC();
        assertEquals(22.86, imc, 0.01);
    }

    @Test
    public void testClasificarIMCInferior() {
        calculadora = new CalculadoraIMC(50, 1.75);
        double imc = calculadora.calcularIMC();
        assertEquals("Peso inferior al normal", calculadora.clasificarIMC(imc));
    }

    @Test
    public void testClasificarIMCNormal() {
        calculadora = new CalculadoraIMC(70, 1.75);
        double imc = calculadora.calcularIMC();
        assertEquals("Peso normal", calculadora.clasificarIMC(imc));
    }

    @Test
    public void testClasificarIMCSuperior() {
        calculadora = new CalculadoraIMC(80, 1.75);
        double imc = calculadora.calcularIMC();
        assertEquals("Peso superior al normal", calculadora.clasificarIMC(imc));
    }

    @Test
    public void testClasificarIMCObesidad() {
        calculadora = new CalculadoraIMC(100, 1.75);
        double imc = calculadora.calcularIMC();
        assertEquals("Obesidad", calculadora.clasificarIMC(imc));
    }
}