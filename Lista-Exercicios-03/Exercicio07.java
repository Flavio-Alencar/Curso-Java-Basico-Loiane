package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 07 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 24MAR26 - 19h13
//Descrição: Faça um Programa que calcule a área de um quadrado, em seguida
//mostre o dobro desta área para o usuário.
//------------------------------------------------------------------------------

public class Exercicio07
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double lado;
        double area;
        //----------------------------------------------------------------------
        
         System.out.println(" ");
        System.out.println("==================================================");
        System.out.println("================ÁREA DE UM QUADRADO===============");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.print("Digite Digite o Valor do Lado do Quadrado [cm]: ");
        lado = scan.nextDouble();
        System.out.println(" ");
        
        area = Math.pow(lado, 2);
        
        System.out.printf("Área do Quadrado: %.2f%s%n", area, "cm^2");
        System.out.printf("Dobro da Área do Quadrado: %.2f%s%n", 2 * area, "cm^2");
        System.out.println("==================================================");
        System.out.println(" ");
    }
    
}
