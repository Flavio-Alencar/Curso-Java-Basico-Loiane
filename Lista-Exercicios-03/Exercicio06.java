package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 06 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 24MAR26 - 19h13
//Descrição: Faça um Programa que peça o raio de um círculo, calcule e mostre 
//sua área.
//------------------------------------------------------------------------------

public class Exercicio06 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double raio;
        double area;
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println("================ÁREA DE UM CÍRCULO================");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.print("Digite Digite o Valor do raio [cm]: ");
        raio = scan.nextDouble();
        System.out.println(" ");
        
        area = Math.PI * Math.pow(raio,2);
        
        System.out.printf("Área do Círculo: %.2f%s%n", area, "cm^2");
        System.out.println("==================================================");
        System.out.println(" ");
        
    }
    
}
