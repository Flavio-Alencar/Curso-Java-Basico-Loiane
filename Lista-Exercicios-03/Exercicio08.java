package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 08 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 24MAR26 - 19h13
//Descrição: Faça um Programa que pergunte quanto você ganha por hora e o número
//de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
//mês.
//------------------------------------------------------------------------------

public class Exercicio08
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double valorHora;
        double salario;
        int horas;
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.println("==================================================");
        System.out.println("=====================SALÁRIO======================");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.print("Digite o Valor da Hora de Trabalho {R$]: ");
        valorHora = scan.nextDouble();
        System.out.println(" ");
        System.out.print("Digite a Quantidade de Horas Trabalhadas: ");
        horas = scan.nextInt();
        System.out.println(" ");
        
        salario = valorHora * horas;
        
        System.out.printf("Salário: %s%.2f%n"," R$", salario);
        System.out.println("==================================================");
        System.out.println(" ");
    }
    
}
