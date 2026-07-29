package Aula15;
import java.util.Scanner;

//Exemplo 01 - Aula 15
//Flavio Silvestre de Alencar - 29JUL26 - 09h53
//Descrição: Operadores Condicionantes (switch e case) 
//------------------------------------------------------------------------------

public class SwitchCase 
{
    public static void main(String[] args)
    {
         //Declaração de Varáveis
        //----------------------------------------------------------------------
        int dia;              
        //----------------------------------------------------------------------
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.print("Digite o Dia da Semana [1 a 7]: ");
        dia = input.nextInt();
        System.out.println(" ");
        
        switch (dia)
        {
            case (1): 
                System.out.print("Domingo");
                System.out.println(" ");
                break;
            
            case (2):
                System.out.print("Segunda-Feira");
                System.out.println(" ");
                break;
                
            case (3):
                System.out.print("Terça-Feira");
                System.out.println(" ");
                break;
                
            case (4):
                System.out.print("Quarta-Feira");
                System.out.println(" ");
                break;
            
            case (5):
                System.out.print("Quinta-Feira");
                System.out.println(" ");
                break;
                
            case (6):
                System.out.print("Sexta-Feira");
                System.out.println(" ");
                break;
                
            case (7):
                System.out.print("Sábado");
                System.out.println(" ");
                break;
                
            default:
                System.out.print("Dia da Semana Inválido");
                System.out.println(" ");
                break;
        }
        
        
        
    }
    
}
