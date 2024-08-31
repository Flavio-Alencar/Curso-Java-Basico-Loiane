//Exercício 19 - Aula 15
//Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
//if - else
//Autor: Flávio Alencar - 31AGO24 - 10h14

import java.util.Scanner;

public class Ex19A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
         //Declaração de Variáveis
        //----------------------------------
        
        int numero;     //Valor do Número.
        int centena;    //Valor da Centena.
        int dezena;     //Valor da Dezena
        int unidade;    //Valor da Unidade.
        
        //----------------------------------
        
        System.out.println("-------------------------------------------");
        System.out.println("QUANTIDADE DE CENTENAS - DEZENAS - UNIDADES");
        System.out.println("-------------------------------------------");
        System.out.println("                                           ");
        System.out.print("Digite um Número Inteiro Menor que 1000: ");
        numero = scan.nextInt();
        System.out.println("                                          ");
        
        if (numero < 1000)
        {
            centena = (numero/100);
            dezena = ((numero -(centena*100))/10);
            unidade = (numero - ((centena * 100) + (dezena *10)));
            
            System.out.println("Centenas: " +centena);
            System.out.println("Dezenas: " +dezena);
            System.out.println("Unidades: " +unidade);
        }
        
        else
        {
            System.out.println("Valor Inválido!!!!");
        }
        
    }
    
}
