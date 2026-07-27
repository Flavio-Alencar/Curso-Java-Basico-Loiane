package Aula14;
import java.util.Scanner;

//Exemplo 01 - Aula 14
//Flavio Silvestre de Alencar - 27JUL26 - 09h53
//Descrição: Operadores Condicionantes (if e else)
//------------------------------------------------------------------------------

public class IfElse
{
    public static void main(String[] args)
    {
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        int idade;        
        //----------------------------------------------------------------------
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a Idade: ");
        idade = input.nextInt();
        System.out.println(" ");
        
        if (idade >= 18)
        {
            System.out.println("Maior de Idade");
        }
        else
        {
            System.out.println("Menor de Idade");            
        }
        
    }
    
}
