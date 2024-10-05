//Exercício 32 - Aula 19
//Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a 
//tabuada de cada um dos elementos do vetor A.
//Method: Array - for
//Autor: Flávio Alencar - 01OUT24 - 20h35

public class Ex32A19 
{
    public static void main (String[] args)
    {
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};            //Array A
        int counter = 1;                                              //Contador.
        int tabuada = 1;
       //-----------------------------------------------------------------------------------------
        
       System.out.printf("%4s%n", "Tabuada");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
        
        ++counter;
        System.out.printf("%n%n");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            tabuada = counter * vetorA[i];
            System.out.printf("%d%s%d%s%d%n", counter, " X ", vetorA[i], " = ", tabuada );
        }
    }
}
