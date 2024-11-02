//Exercício 02 - Lista 10
//Escreva um método recursivo e estático que receba um número inteiro positivo N
//e calcule o somatório dos números de 1 a N 
//Autor: Flávio Alencar - 02OUT24 - 14h53 PM

package exercicios.Lista10;

public class Somatorio {
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private static int n1;
    //--------------------------------------------------------------------------
    
    public static int somatorio(int n1){
        int soma = 0;
        if(n1 <= 1){
            return 1;
        }
        
        return soma = n1 + somatorio(n1-1);
                
    }
    
}
