//Exercício 22 - Aula 15
//Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
//switch - case
//Autor: Flávio Alencar - 31AGO24 - 11h35

import java.util.Scanner; //Importando a classe Scanner

public class Ex22A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        int numero;        //Valor do numero.
        int resto;         //Valor da Quantidade de Notas de R$100,00
        
        //-----------------------------------
        
        System.out.print("Digite um Número Inteiro: ");
        numero = scan.nextInt();
        System.out.println("                            ");
        
        resto = numero % 2;
        
        switch (resto)
        {
            case 0: System.out.println("O Número é Par"); break;
            default: System.out.println("O Número é Ímpar"); break;
        }
    }
    
}
