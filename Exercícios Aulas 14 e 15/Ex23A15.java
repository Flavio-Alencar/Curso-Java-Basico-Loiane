//Exercício 23 - Aula 15
//Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
//switch - case
//Autor: Flávio Alencar - 31AGO24 - 11h35

import java.util.Scanner; //Importando a classe Scanner

public class Ex23A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double numero;        //Valor do numero.
        double valor;         //Valor de referencia se será inteiro ou decimal
        
        //-----------------------------------
        
        System.out.print("Digite um Número: ");
        numero = scan.nextDouble();
        System.out.println("                            ");
        
        valor = Math.round(numero);
        
       if (numero == valor)
       {
           System.out.println("O Valor é Inteiro");
       }
       else
       {
           System.out.println("O Valor é Decimal");
       }
    }
    
}