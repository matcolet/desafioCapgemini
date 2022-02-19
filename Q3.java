package Desafio;

import java.util.*;

/**
 *
 * @author Mateus Colet
 */
public class Q3 {
    /**
    * Metodo anagramas em substrings 
    *
    * @param string input 
    * @return int quantidades de caracteres restates - (0 Sucesso) 
    */
    private static int anagramas(String input) {
        int cont = 0;

        input = input.replaceAll("\\s+", "").toLowerCase();
      
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                //gera um array de substrings 
                char[] Subs = input.substring(i, j + 1).toCharArray();
                //classificando os sub-array
                Arrays.sort(Subs);
                String res = new String(Subs);

                if (map.containsKey(res)) {
                    map.put(res, map.get(res) + 1);
                } else {
                    map.put(res, 1);
                }
            }
        }
        
        // acessando e contando a ocorrencia de substring 
        cont = map.keySet().stream().map(key -> 
                map.get(key)).map(n -> 
                (n * (n - 1)) / 2).reduce(cont, Integer::sum);

        return cont;
    }

    public static void main(String[] args) {

        System.out.println(anagramas("ifailuhkqq"));
        System.out.println(anagramas("Ovo"));
        System.out.println(anagramas("amorroma"));
    }

}
