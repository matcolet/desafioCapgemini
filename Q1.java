package Desafio;

/**
 *
 * @author Mateus Colet
 */
public class Q1 {
           
    /**
    * Metodo escada, printa na tela uma escada de asteriscos 
    *
    * @param tamanho escada
    * @return void
    */ 
    private static void escada( int n){
        for (int i = 0; i < n; i++) {
            for (int j = n; j >= 0; j--) {
                if( i >= j)
                    System.out.print("*");
                else // remove somente o else vira um pinheiro de natal
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {        
        
        escada(6);
        
    }
    
}
