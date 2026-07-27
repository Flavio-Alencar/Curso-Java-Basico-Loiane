package Aula14;
import java.util.Scanner;

//Exemplo 02 - Aula 14
//Flavio Silvestre de Alencar - 27JUL26 - 09h53
//Descrição: Operadores Condicionantes (if e else) aninhado
//------------------------------------------------------------------------------

public class IfElseAninhado 
{
    public static void main(String[] args) 
    {
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        double preco;        
        //----------------------------------------------------------------------
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.print("Digite o Valor do Produto [R$]: ");
        preco = input.nextDouble();
        System.out.println(" ");
        
        if (preco <= 10)
        {
            System.out.println("O Produto Está Barato!!");
        }
        else
        {
            if (preco > 10 && preco < 15)
            {
                System.out.println("Pedir Desconto");
            }
            else
            {
                if (preco >= 15 && preco < 17)
                {
                    System.out.println("Pesquisar Mais");
                }
                else
                {
                    System.out.println("Muito Caro");
                }                
            }
        }
        
    }
    
}
