//Exercício 17 - Aula 15

//Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
//switch - case
//Autor: Flávio Alencar - 30AGO24 - 21h02

import java.util.Scanner; //Importando a classe Scanner 

public class Ex17A15 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
         //Declaração de Variáveis
        //----------------------------------
        
        int ano;     //Variável do Ano.
        int resto;  //Valor do Resto da Divisão.
        
        //----------------------------------
        
        System.out.println("------------------------------------------");
        System.out.println("     VERIFICAÇÃO SE UM ANO É BISSEXTO     ");
        System.out.println("------------------------------------------");
        System.out.println("                                          ");
        System.out.print("Digite o Ano: ");
        ano = scan.nextInt();
        System.out.println("                                          ");
        
        resto = ano % 4;
        
        switch (resto)
        {
            case 0: System.out.printf("O Ano %d%s%n", ano, " é Bissexto"); break;
            default: System.out.printf("O Ano %d%s%n", ano, " NÃO é Bissexto"); break;
        }
        
    }
    
}
