package Desafio;

import java.util.regex.Pattern;

/**
 *
 * @author Mateus Colet
 */
public class Q2 {

    /**
    * Metodo valida senha:
    * Possui no mínimo 6 caracteres.
    * Contém no mínimo 1 digito.
    * Contém no mínimo 1 letra em minúsculo.
    * Contém no mínimo 1 letra em maiúsculo.
    * Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
    *
    * @param string senha 
    * @return int quantidades de caracteres restates - (0 Sucesso) 
    */
    private static int validaSenha(String senha) {
        int caracter;
        final String digito = "^(?=.*\\d).{6,}$";
        final String lMin = "^(?=.*[a-z]).{6,}$";
        final String lMai = "^(?=.*[A-Z]).{6,}$";
        final String especiais = "^(?=.*[!@#$%^&*()-+]).{6,}$";

        // remove espaços em branco 
        senha = senha.replaceAll("\\s+","");
                
        if (senha.length() < 6) {
            caracter = 6 - senha.length();
        } else {
            caracter = 0;
            if (!Pattern.matches(digito, senha)) {
                caracter++;
            }
            if (!Pattern.matches(lMin, senha)) {
                caracter++;
            }
            if (!Pattern.matches(lMai, senha)) {
                caracter++;
            }
            if (!Pattern.matches(especiais, senha)) {
                caracter++;
            }
        }

        return caracter;
    }

    public static void main(String[] args) {

        System.out.println(validaSenha("3aN3#3"));

    }
}
