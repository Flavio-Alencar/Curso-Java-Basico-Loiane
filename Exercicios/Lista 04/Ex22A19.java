//Exercício 22 - Aula 19
//Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, 
//sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar
//um programa que determine o percentual de números 0's e 1's existentes no vetor A.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 10h23 AM

public class Ex22A19 
{
    public static void main (String[] args)
    {
        
        //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];            //Array vetorA
        int qtdum = 0;                       //Variável que armazena a quantidade de 1.
        int qtdzero = 0;                     //Variável que armazena a quantidade de 0
        double um = 0.0;                       //Variável de porcentagem de valores 1
        double zero = 0.0;                     //Variável de porcentagem de valores 0
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = (int)Math.round(Math.random() *1);
                        
            if (vetorA[i] == 0)
            {
                ++qtdzero;                
            }
            else
            {
                ++qtdum;
            }
        }
        
        zero = (double)(qtdzero*100/vetorA.length);
        um = (double)(qtdum*100/vetorA.length);
        
        System.out.println("Porcentagem de Zeros: " +zero +"%");
        System.out.println("Porcentagem de Ums: " +um +"%");
       
    }
    
}
