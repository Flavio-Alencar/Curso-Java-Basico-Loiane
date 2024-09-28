//Exemple 01 - Aula 18
//Loiane Training - Java Basic Course
//Edited by Flávio Alencar
//Date: 25SET24 - 10h24 AM

import java.util.Scanner;

public class Exemplo01 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um Número: ");
        int num = scan.nextInt();
        
        System.out.println("Entre com um Limite: ");
        int limite = scan.nextInt();
        
        for (int i = num; i <= limite; i++)
        {
            System.out.println(i);
            
            if (i % 7 == 0)
            {
                System.out.println("O Valor de i é: " +i);
                //break;
            }            
        }
        
    }
}
