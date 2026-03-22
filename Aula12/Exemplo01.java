package Aula12;
import java.util.Scanner;

//Exemplo 01 - Aula 12
//Flavio Silvestre de Alencar - 22MAR26 - 11h02
//Descrição: Leitura de Dados do Teclado
//------------------------------------------------------------------------------

public class Exemplo01 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        String nome;
        int idade;
        double altura;
        //----------------------------------------------------------------------
        
        System.out.print("Digite o Nome Completo: ");
        nome = scan.nextLine();
        System.out.println(" ");
        System.out.print("Digite a Idade: ");
        idade = scan.nextInt();
        System.out.println(" ");
        System.out.print("Digite a Altura: ");
        altura = scan.nextDouble();
        System.out.println(" ");
        
        System.out.println("========================================");
        System.out.println("==========DADOS DIGITADOS===============");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%s%n", idade, " anos");
        System.out.printf("Altura: %.2f%s%n", altura, " m");
        System.out.println("========================================");
    }
    
}
