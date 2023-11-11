/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculobases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of DeBaseXABaseY method, of class Calculadora.
     */
    @Test
    public void testDeBaseXABaseY() {
        System.out.println("DeBaseXABaseY");
        String numeroBaseX = "";
        int baseX = 0;
        int baseY = 0;
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.DeBaseXABaseY(numeroBaseX, baseX, baseY);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BaseDecimal method, of class Calculadora.
     */
    @Test
    public void testBaseDecimal() {
        System.out.println("BaseDecimal");
        int decimal = 9;
        boolean expResult = false;
        boolean result = Calculadora.BaseDecimal(decimal);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BaseBinario method, of class Calculadora.
     */
    @Test
    public void testBaseBinario() {
        System.out.println("BaseBinario");
        int binario = 1;
        boolean expResult = false;
        boolean result = Calculadora.BaseBinario(binario);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of BaseOctal method, of class Calculadora.
     */
    @Test
    public void testBaseOctal() {
        System.out.println("BaseOctal");
        int octal = 7;
        boolean expResult = false;
        boolean result = Calculadora.BaseOctal(octal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BaseHexadecimal method, of class Calculadora.
     */
    @Test
    public void testBaseHexadecimal() {
        System.out.println("BaseHexadecimal");
        String hexadecimal = "B";
        boolean expResult = false;
        boolean result = Calculadora.BaseHexadecimal(hexadecimal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decimalXbinario method, of class Calculadora.
     */
    @Test
    public void testDecimalXbinario() {
        System.out.println("decimalXbinario");

        String expResult = "";
        String result = Calculadora.decimalXbinario(9);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of decimalXoctal method, of class Calculadora.
     */
    @Test
    public void testDecimalXoctal() {
        System.out.println("decimalXoctal");
        int decimal = 0;
        String expResult = "";
        String result = Calculadora.decimalXoctal(decimal);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of decimalXHexadecimal method, of class Calculadora.
     */
    @Test
    public void testDecimalXHexadecimal() {
        System.out.println("decimalXHexadecimal");
        int decimal = 0;
        String expResult = "";
        String result = Calculadora.decimalXHexadecimal(decimal);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of binarioXdecimal method, of class Calculadora.
     */
    @Test
    public void testBinarioXdecimal() {
        System.out.println("binarioXdecimal");
        int binario = 0;
        int expResult = 0;
        int result = Calculadora.binarioXdecimal(binario);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of octalXdecimal method, of class Calculadora.
     */
    @Test
    public void testOctalXdecimal() {
        System.out.println("octalXdecimal");
        int octal = 0;
        int expResult = 0;
        int result = Calculadora.octalXdecimal(octal);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of hexadecimalXdecimal method, of class Calculadora.
     */
    @Test
    public void testHexadecimalXdecimal() {
        System.out.println("hexadecimalXdecimal");
        String hexadecimal = "";
        int expResult = 0;
        int result = Calculadora.hexadecimalXdecimal(hexadecimal);
        assertEquals(expResult, result);
        
    }
    
}
