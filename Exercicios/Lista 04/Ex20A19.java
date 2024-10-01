//Exercício 20 - Aula 19
//Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real
//(R$) e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
//A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 10h23 AM

import java.util.Scanner;

public class Ex20A19
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        double[] vetorA = new double[20];            //Array vetorA
        double cotacao = 0.0;                        //Cotação do Dolar em relação ao Real.
        //-----------------------------------------------------------------------------------------
        
        System.out.print("Digite a Cotação do Dolar em relação ao Real: ");
        cotacao = scan.nextDouble();
        System.out.println();
        
        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = cotacao * (i+1);
        }
        
        System.out.println("Vetor A");
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%.2f%s", vetorA[i], " ");            
        }
        
    }
    
}
