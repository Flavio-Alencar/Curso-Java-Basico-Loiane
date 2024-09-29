
import java.util.Scanner;

//Exercício 18 - Aula 15

//Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
//if - else
//Autor: Flávio Alencar - 30AGO24 - 21h24

public class Ex18A15 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
         //Declaração de Variáveis
        //----------------------------------
        
        int dia;     //Valor do Dia.
        int mes;     //Valor do Mês.
        int ano;     //Valor do Ano.
        int resto;   //Valor do Resto.
        
        //----------------------------------
        
        System.out.println("------------------------------------------");
        System.out.println("     VERIFICAÇÃO SE UMA DATA É VÁLIDA     ");
        System.out.println("------------------------------------------");
        System.out.println("                                          ");
        System.out.print("Digite o Dia: ");
        dia = scan.nextInt();
        System.out.println("                                          ");
        
        System.out.print("Digite o Mês: ");
        mes = scan.nextInt();
        System.out.println("                                          ");
        
        System.out.print("Digite o Ano: ");
        ano = scan.nextInt();
        System.out.println("                                          ");
        
        resto = ano % 4;
        
        if ((dia >=1 && dia <= 31)&&(mes == 1||mes == 3||mes == 5||mes == 7||mes == 8||mes == 10||mes == 12))
        {
            System.out.printf("A data: %d%s%d%s%d%s%n", dia, "/", mes, "/", ano, " é Válida");
        }
        
        else if ((dia >=1 && dia <= 30)&&(mes == 4||mes == 6||mes == 9||mes == 11))
        {
            System.out.printf("A data: %d%s%d%s%d%s%n", dia, "/", mes, "/", ano, " é Válida");
        }
        
        else if ((resto == 0) && (dia >= 1 && dia <= 29))
        {
            System.out.printf("A data: %d%s%d%s%d%s%n", dia, "/", mes, "/", ano, " é Válida");
        }
        
        else if ((resto != 0) && (dia >= 1 && dia <= 28))
        {
            System.out.printf("A data: %d%s%d%s%d%s%n", dia, "/", mes, "/", ano, " é Válida");
        }
        
        else
        {
            System.out.printf("A data: %d%s%d%s%d%s%n", dia, "/", mes, "/", ano, " é Inválida");
        }
        
    }
    
}
