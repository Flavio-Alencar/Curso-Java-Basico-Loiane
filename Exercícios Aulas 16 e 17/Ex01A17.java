//Exercício 01 - Aula 17

//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem 
//caso o valor seja inválido e continue pedindo até que o usuário informe um 
//valor válido.
//while 
//Autor: Flávio Alencar - 11SET24 - 17h58

import java.util.Scanner;

public class Ex01A17
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor da Nota [0 - 10]: ");
        double nota = scan.nextDouble();
        System.out.println();
        
        while (nota < 0 || nota > 10)
        {
            System.out.print("Nota Inválida, Digite Novamente a Nota: ");
            nota = scan.nextDouble();
            System.out.println();
        }
        
        System.out.println("Nota Digitada: " +nota);
        
    }
}
