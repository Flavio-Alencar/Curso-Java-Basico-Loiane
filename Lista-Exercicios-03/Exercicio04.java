package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 04 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 23MAR26 - 17h26
//Descrição: Faça um Programa que peça as 4 notas bimestrais e mostre a média.
//------------------------------------------------------------------------------

public class Exercicio04 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double n1;
        double n2;
        double n3;
        double n4;
        double media;
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.print("Digite a Nota 01: ");
        n1 = scan.nextDouble();
        System.out.println(" ");
        System.out.print("Digite a Nota 02: ");
        n2 = scan.nextDouble();
        System.out.println(" ");
        System.out.print("Digite a Nota 03: ");
        n3 = scan.nextDouble();
        System.out.println(" ");
        System.out.print("Digite a Nota 04: ");
        n4 = scan.nextDouble();
        System.out.println(" ");
        
        media = (n1 + n2 + n3 + n4) / 4;
        
        System.out.printf("Média = %.2f%n", media);
    }
    
}
