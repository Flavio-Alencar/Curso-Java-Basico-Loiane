package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 15 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 30MAR26 - 09h30
//Descrição: Faça um Programa que pergunte quanto você ganha por hora e o número
//de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
//mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS
//e 5% para o sindicato, faça um programa que nos dê:
//a. salário bruto.
//b. quanto pagou ao INSS.
//c. quanto pagou ao sindicato.
//d. o salário líquido.
//e. calcule os descontos e o salário líquido
//------------------------------------------------------------------------------

public class Exercicio15
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        int nHoras;
        double valorHora;
        double salarioBruto;
        double iR;
        double inss;
        double sindicato;
        double salarioLiquido;
        double totalDesconto;
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.print("Digite o Valor da Hora de Trabalho [R$]: ");
        valorHora = scan.nextDouble();
        System.out.println(" ");
        System.out.print("Digite a Quantidade de Horas de Trabalho: ");
        nHoras = scan.nextInt();
        System.out.println(" ");
        
        salarioBruto = valorHora * nHoras;
        iR = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        totalDesconto = (iR + inss + sindicato);
        salarioLiquido = salarioBruto - totalDesconto;
        
        System.out.println("==================================================");
        System.out.println("-------------------CONTRACHEQUE-------------------");
        System.out.println("==================================================");
        System.out.println(" ");
        System.out.printf("Salário Bruto: %s%.2f%n", "R$", salarioBruto);
        System.out.printf("Imposto de Renda: %s%.2f%n", "R$", iR);
        System.out.printf("INSS: %s%.2f%n", "R$", inss);
        System.out.printf("Sindicato: %s%.2f%n", "R$", sindicato);
        System.out.println("--------------------------------------------------");
        System.out.printf("Total de Desconto: %s%.2f%n", "R$", totalDesconto);
        System.out.printf("Salário Líquido: %s%.2f%n", "R$", salarioLiquido);
        System.out.println(" ");
        System.out.println("==================================================");
       
    }
    
}
