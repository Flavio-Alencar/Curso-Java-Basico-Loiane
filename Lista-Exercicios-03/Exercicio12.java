package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 12 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 25MAR26 - 10h26
//Descrição: Tendo como dados de entrada a altura de uma pessoa, construa um
//algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//(72.7*altura) - 58
//------------------------------------------------------------------------------

public class Exercicio12
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double altura;
        double pesoIdeal;       
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.print("Digite a Altura [m]: ");
        altura = scan.nextDouble();
        System.out.println(" ");
        
        pesoIdeal = ((72.7 * altura) - 58);                
        System.out.printf("Peso ideal: %.2f%s%n", pesoIdeal, " Kg");
        System.out.println(" ");
        System.out.println("==================================================");
       
    }
    
}
