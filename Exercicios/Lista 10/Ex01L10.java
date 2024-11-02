//Exercício 01 - Lista 10
//Escreva um método recursivo e estático que calcule e retorne o N-­‐ésimo termo 
//da sequência Fibonacci. Alguns números desta sequência são: 0,  1, 1, 2, 3, 5,
//8, 13, 21, 34, 55, 89... 
//Autor: Flávio Alencar - 02OUT24 - 14h39 PM

package exercicios.Lista10;
import java.util.Scanner;

public class Ex01L10 {
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o Valor do Ultimo Termo da Sequencia de Fibonacci: ");
        int n1 = scan.nextInt();
        System.out.println();
        
        int fb = Fibonacci.fibonacci(n1);
        
        System.out.println("Fibonacci: " +fb);
        
    }
    
}
