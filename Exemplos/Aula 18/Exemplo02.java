//Exemple 01 - Aula 18
//Loiane Training - Java Basic Course
//Edited by Flávio Alencar
//Date: 25SET24 - 10h57 AM

import java.util.Scanner;

public class Exemplo02
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com um Número: ");
        int num = scan.nextInt();
        System.out.println();
        
        System.out.print("Entre com um Limite: ");
        int limite = scan.nextInt();
        System.out.println();
        
        for (int i = num; i <= limite; i++)
        {
           if (i % 7 == 0)
            {
                continue;
            }  
            
            System.out.println("O Valor de i é: " +i);
        }
    
}
    
}
