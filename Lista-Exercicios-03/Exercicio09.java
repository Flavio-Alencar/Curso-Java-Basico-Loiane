package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 09 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 24MAR26 - 19h13
//Descrição: Faça um Programa que peça a temperatura em graus Farenheit, transforme
//e mostre a temperatura em graus Celsius. 
//C = (5 * (F-32) / 9).
//------------------------------------------------------------------------------

public class Exercicio09
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
        System.out.print("Digite a Temperatura em Farenheit [ºF]: ");
        tempF = scan.nextDouble();
        System.out.println(" ");
                
        tempC = (5 * (tempF - 32) / 9);
        
        System.out.printf("Temperatura: %.2f%s%n", tempF, "ºF");
        System.out.printf("Temperatura: %.2f%s%n", tempC, "ºC");
        System.out.println("==================================================");
        System.out.println(" ");
    }
    
}
