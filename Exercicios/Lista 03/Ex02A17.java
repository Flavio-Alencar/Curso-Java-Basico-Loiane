//Exercício 02 - Aula 17

//Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
//senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando 
//a pedir as informações.
//while 
//Autor: Flávio Alencar - 11SET24 - 18h10

import java.util.Scanner;

public class Ex02A17
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o seu Nome: ");
        String nome = scan.nextLine();
        System.out.println();
        System.out.print("Defina a sua Senha: ");
        String senha = scan.nextLine();
        System.out.println();
        
        while (senha.equals(nome))
        {
            System.out.print("Senha Inválida, Defina uma Nova Senha: ");
            senha = scan.nextLine();
            System.out.println();
        }
        
        System.out.println("Senha Atualizada com Sucesso");
        
    }
}
