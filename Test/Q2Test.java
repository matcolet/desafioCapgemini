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
public class Q2Test {

    @Test
    public void testValidaSenha1() {
        final String senha = "3aN3#3";
        final int esperado = 0;
        final int obtido = Q2.validaSenha(senha);
        assertEquals(esperado, obtido);
    }

    @Test
    public void testValidaSenha2() {
        final String senha = "aaaaaa";
        final int esperado = 3;
        final int obtido = Q2.validaSenha(senha);
        assertEquals(esperado, obtido);
    }

    @Test
    public void testValidaSenha3() {
        final String senha = "   3#3";
        final int esperado = 3;
        final int obtido = Q2.validaSenha(senha);
        assertEquals(esperado, obtido);
    }

    @Test
    public void testValidaSenha4() {
        final String senha = "    ";
        final int esperado = 6;
        final int obtido = Q2.validaSenha(senha);
        assertEquals(esperado, obtido);
    }

    @Test
    public void testValidaSenha5() {
        final String senha = "Asswrty";
        final int esperado = 2;
        final int obtido = Q2.validaSenha(senha);
        assertEquals(esperado, obtido);
    }

}
