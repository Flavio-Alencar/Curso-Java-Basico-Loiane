//Exercício 01 - Lista 10
//Escreva um método recursivo e estático que calcule e retorne o N-­‐ésimo termo 
//da sequência Fibonacci. Alguns números desta sequência são: 0,  1, 1, 2, 3, 5,
//8, 13, 21, 34, 55, 89... 
//Autor: Flávio Alencar - 02OUT24 - 13h55 PM

package exercicios.Lista10;

public class Fibonacci {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private static int n1;
    //--------------------------------------------------------------------------
    
    public static int fibonacci(int n1){
        int fib = 0;
        
        if(n1 <= 2){
            return 1;
        }
        return fib = fibonacci(n1-1) + fibonacci(n1-2);       
        }
    }
    
