//Exercício 27 - Aula 19
//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo
//e tamanho, obedecendo as seguintes regras de formação: 
//a) Bi deverá receber 'a' quando Ai for menor que 7; 
//b) Bi deverá receber 'b' quando Ai for igual a 7; 
//c) Bi deverá receber 'c' quando Ai for maior que 7 e menor que 10; 
//d) Bi deverá receber 'd' quando Ai for igual a 10; e 
//e) Bi deverá receber 'e' quando Ai for maior que 10.
//Sugestão: char B[10];
//Method: Array - for - if - else
//Autor: Flávio Alencar - 30SET24 - 17h24 

import java.util.Scanner;

public class Ex27A19 
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
         //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[] vetorA = new int[10];                  //Array A
        char[] vetorB = new char[vetorA.length];     //Array B
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.print("Digite um Número Inteiro do Vetor A na Posição " +i +" : ");
            vetorA[i] = scan.nextInt();
            System.out.println();
            
            if (vetorA[i] < 7)
            {
                vetorB[i] = 'a';
            }
            else if (vetorA[i] == 7)
            {
                vetorB[i] = 'b';
            }
            else if (vetorA[i] > 7 && vetorA[i] < 10)
            {
                vetorB[i] = 'c';
            }
            else if (vetorA[i] == 10)
            {
                vetorB[i] = 'd';
            }
            else if (vetorA[i] > 10)
            {
                vetorB[i] = 'e';
            }
        }
        
        System.out.printf("%s%10s%n","Vetor A", "Vetor B");
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.printf("%3d%10s%n", vetorA[i], vetorB[i]);
        }
        
        
    }
}
