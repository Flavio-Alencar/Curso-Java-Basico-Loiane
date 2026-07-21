package ListaExercicio03;
import java.util.Scanner;

//Exeercicio 02 - Lista de Exercício 03
//Flavio Silvestre de Alencar - 23MAR26 - 17h11
//Descrição: Faça um Programa que peça um número e então mostre a mensagem "O número
//informado foi [número]".
//------------------------------------------------------------------------------

public class Exercicio02
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        int n1;       
        //----------------------------------------------------------------------
        
        System.out.println(" ");
        System.out.print("Digite um Número Inteiro: ");
        n1 = scan.nextInt();
        System.out.println(" ");
        System.out.println("O Número Digitado foi: " +n1);
        
        
    }
    
}
