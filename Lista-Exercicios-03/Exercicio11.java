package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 11 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 25MAR26 - 10h06
//Descrição: Faça um Programa que peça 2 números inteiros e um número real. 
//Calcule e mostre:
//  a. o produto do dobro do primeiro com metade do segundo .
//  b. a soma do triplo do primeiro com o terceiro.
//  c. o terceiro elevado ao cubo.
//------------------------------------------------------------------------------

public class Exercicio11
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        int n1;
        int n2;
        double n3;
        double resultado;
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.print("Digite um Número Inteiro n1: ");
        n1 = scan.nextInt();
        System.out.println(" ");
        System.out.print("Digite um Número Inteiro n2: ");
        n2 = scan.nextInt();
        System.out.println(" ");
        System.out.print("Digite um Númeor Real n3: ");
        n3 = scan.nextDouble();
        System.out.println(" ");
        
        resultado = (2 * n1) * (n2 / 2);                
        System.out.printf("a): %.2f%n", resultado);
        System.out.println(" ");
        
        resultado = (3 * n1) + n3;
        System.out.printf("b): %.2f%n", resultado);
        System.out.println(" ");
        
        resultado = Math.pow(n3, 3);
        System.out.printf("c): %.2f%n", resultado);
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println(" ");
    }
    
}
