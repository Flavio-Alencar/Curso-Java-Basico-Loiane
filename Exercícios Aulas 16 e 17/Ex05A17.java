//Exercício 05 - Aula 17

//Altere o programa anterior permitindo ao usuário informar as populações e as 
//taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

//Method: do 
//Autor: Flávio Alencar - 13SET24 - 18h31 AM

import java.util.Scanner;


public class Ex05A17 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //                                Variables
        //----------------------------------------------------------------------
        int a = 0;                   //Variável da População do País A.
        int b = 0;                   //Variável da População do País B.
        double ta = 0.00;            //Taxa de Crescimento Populacional do País A.
        double tb = 0.00;            //Taxa de Crescimento Populacional do País B.
        int anos = 0;                //Quantidade de Anos.
        //----------------------------------------------------------------------
        
        System.out.print("Digite a População do País A: ");
        a = scan.nextInt();
        System.out.println();
        
        while (a <=0 )
        {
            System.out.print("Valor Incorreto, Digite a População do País A: ");
            a = scan.nextInt();            
        }
            
        System.out.print("Digite a População do País B: ");
        b = scan.nextInt();
        System.out.println();
        
        while (b <=0 )
        {
            System.out.print("Valor Incorreto, Digite a População do País B: ");
            b = scan.nextInt();            
        } 
        
        System.out.print("Digite a Taxa de Crecimento do País A [%]: ");
        ta = scan.nextDouble();
        System.out.println();
        
        while (ta <=0 )
        {
            System.out.print("Valor Incorreto, a Taxa de Crecimento do País A [%]: ");
            ta = scan.nextDouble();
        }
        
        System.out.print("Digite a Taxa de Crecimento do País B [%]: ");
        tb = scan.nextDouble();
        System.out.println();
        
        while (tb <=0 )
        {
            System.out.print("Valor Incorreto, a Taxa de Crecimento do País B [%]: ");
            tb = scan.nextDouble();
        }
        
        ta = (1+(ta/100));
        tb = (1+(tb/100));
        
        while (a < b)
        {
            a *= ta;
            b *= tb;
            ++anos;
        }
        
        System.out.printf("População do País A: %d%n", a);
        System.out.printf("População do País B: %d%n", b);
        System.out.printf("Em %d%s%s%n", anos," anos", " o país A ultrapassará a população do país B");
        
    }
    
}
