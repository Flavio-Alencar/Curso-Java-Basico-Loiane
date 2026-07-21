package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 03 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 23MAR26 - 17h20
//Descrição: Faça um Programa que peça dois números e imprima a soma.
//------------------------------------------------------------------------------

public class Exercicio03 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        int n1;
        int n2;
        int soma;
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.print("Digite um Número Inteiro n1: ");
        n1 = scan.nextInt();
        System.out.println(" ");
        System.out.print("Digite um Número Inteiro n2: ");
        n2 = scan.nextInt();
        System.out.println(" ");
        
        soma = n1 + n2;
        
        System.out.printf("n1 + n2 = %d%n", soma);
    }
    
}
