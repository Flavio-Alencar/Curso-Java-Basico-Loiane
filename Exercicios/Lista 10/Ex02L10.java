//Exercício 02 - Lista 10
//Escreva um método recursivo e estático que receba um número inteiro positivo N
//e calcule o somatório dos números de 1 a N 
//Autor: Flávio Alencar - 02OUT24 - 14h53 PM
//Vinculado a classe Somatorio.

package exercicios.Lista10;
import java.util.Scanner;

public class Ex02L10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Somatório de 1 a N");
        System.out.print("Digite o valor de N: ");
        int n1 = scan.nextInt();
        System.out.println("");
        
        int soma = Somatorio.somatorio(n1);
        
        System.out.println("O Somatório de 1 a " +n1 +" = " +soma);
        
    }
    
}
