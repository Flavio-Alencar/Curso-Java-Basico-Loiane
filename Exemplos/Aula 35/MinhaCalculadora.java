//Exemplo 01 - Aula 35
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 25OUT24 - 16h08
//Assunto: Recursividade.

package exemplos.Aula35;

public class MinhaCalculadora {

    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private static int n1;
    //--------------------------------------------------------------------------
    
    public static int fatorialNR(int n1){
        int fat = 1;    
        for(int i = 0; i < n1; i++){
            fat *= (i+1);
        }
        System.out.println(+n1 +"! = " +fat);
        return fat;
    }
    
    public static int fatorialR(int n1){
        if(n1 == 0){
            return 1;
        }
        return n1 * fatorialR(n1-1);
        
    }
    
}
