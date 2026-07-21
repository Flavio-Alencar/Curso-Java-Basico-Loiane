package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 10 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 25MAR26 - 10h00
//Descrição: Faça um Programa que peça a temperatura em graus Celsius, transforme
//e mostre em graus Farenheit.
//------------------------------------------------------------------------------

public class Exercicio10
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double tempF;
        double tempC;
        
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println("===============CONVERSOR TABAJARA=================");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.print("Digite a Temperatura em Celsius [ºC]: ");
        tempC = scan.nextDouble();
        System.out.println(" ");
                
        tempF = ((1.8 * tempC) + 32);
        
        System.out.printf("Temperatura: %.2f%s%n", tempC, "ºC");
        System.out.printf("Temperatura: %.2f%s%n", tempF, "ºF");
        System.out.println("==================================================");
        System.out.println(" ");
    }
    
}
