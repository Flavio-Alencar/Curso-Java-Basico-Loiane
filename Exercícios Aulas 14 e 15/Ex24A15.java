//Exercício 24 - Aula 15
//Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
//O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
//a. par ou ímpar;
//b. positivo ou negativo;
//c. inteiro ou decimal.
//if - else / switch - case
//Autor: Flávio Alencar - 31AGO24 - 12h09

import java.util.Scanner; //Importando a classe Scanner

public class Ex24A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double n1;            //Valor do numero 1.
        double n2;            //Valor do Número 2.
        double valor;         //Valor de referencia se será inteiro ou decimal
        double resto;         //Valor de referencia se o número será par ou ímpar
        double resultado = 0; //Valor do Resultado da Operação Matemática.  
        int op;               //Variável para Indicar o Tipo de Operação (Adição, Subtração, Multiplicação ou Divisão).
                
        //-----------------------------------
        
        System.out.print("Digite o Primeiro Número: ");
        n1 = scan.nextDouble();
        System.out.println("                            ");
        
        System.out.print("Digite o Segundo Número: ");
        n2 = scan.nextDouble();
        System.out.println("                            ");
        
        System.out.print("Digite o Tipo de Operação [1] Adição, [2] Subtração, [3] Multiplicação, [4] Divisão: ");
        op = scan.nextInt();
        System.out.println("                            ");
        
        switch (op)
        {
            case (1):
                resultado = n1 + n2; break;            
            case (2):
                resultado = n1 - n2; break;                
            case (3):
                resultado = n1 * n2; break;                
            case (4):
                resultado = n1 / n2; break;                        
            default: System.out.println("Operação Inválida!!");
        }
        
        valor = Math.round(resultado);
        resto = resultado % 2;
        System.out.printf("O resultado é: %.2f%n", resultado);
        
        if (resto == 0)
        {
            System.out.println("O Resultado é um Número Par");
        }
        else
        {
            System.out.println("O Resultado é um Número Ímpar");
        }
        
        if (resultado >= 0)
        {
            System.out.println("O Resultado é um Número Positivo");
        }
        else
        {
            System.out.println("O Resultado é um Número Negativo");
        }
        
        if (resultado == valor)
       {
           System.out.println("O Valor é Inteiro");
       }
       else
       {
           System.out.println("O Valor é Decimal");
       }
       
       
    }
    
}