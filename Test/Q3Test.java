/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desafio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mat
 */
public class Q3Test {

    @Test
    public void testAnagramas1() {
        final String texto = "ifailuhkqq";
        final int esperado = 3;
        final int obtido = Q3.anagramas(texto);
        assertEquals(esperado, obtido);
    }

    @Test
    public void testAnagramas2() {
        final String texto = "Ovo";
        final int esperado = 2;
        final int obtido = Q3.anagramas(texto);
        assertEquals(esperado, obtido);
    }

    @Test
    public void testAnagramas3() {
        final String texto = "amorRoma";
        final int esperado = 16;
        final int obtido = Q3.anagramas(texto);
        assertEquals(esperado, obtido);
    }

    @Test
    public void testAnagramas4() {
        final String texto = "   kkk";
        final int esperado = 4;
        final int obtido = Q3.anagramas(texto);
        assertEquals(esperado, obtido);
    }

    @Test
    public void testAnagramas5() {
        final String texto = "oloco";
        final int esperado = 6;
        final int obtido = Q3.anagramas(texto);
        assertEquals(esperado, obtido);
    }

}
