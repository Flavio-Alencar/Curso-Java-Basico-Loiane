package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 05 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 23MAR26 - 17h34
//Descrição: Faça um Programa que converta metros para centímetros.
//------------------------------------------------------------------------------

public class Exercicio05 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double metro;
        double centimetro;
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println("================CONVERSOR TABAJARA================");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.print("Digite Digite o Valor [m]: ");
        metro = scan.nextDouble();
        System.out.println(" ");
        
        centimetro = metro * 100;
        
        System.out.printf("Resultado: %.2f%s%n", centimetro, " [cm]");
        
    }
    
}
