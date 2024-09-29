//Exercício 16 - Aula 15

//Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c = 0.
//Autor: Flávio Alencar - 30AGO24 - 16h26

import java.util.Scanner; //Importando a classe Scanner 

public class Ex16A15 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
         //Declaração de Variáveis
        //----------------------------------
        
        double a;     //Valor da Variável "a" do polinômio de Segundo Grau.
        double b;     //Valor da Variável "b" do polinômio de Segundo Grau.
        double c;     //Valor da Variável "a" do polinômio de Segundo Grau.
        double delta; //Valor de Delta;
        double r1;    //Valor da Primeira Raiz.
        double r2;    //Valor da Segunda Raiz.
        
        //----------------------------------
        
        
            System.out.println("------------------------------------------");
            System.out.println("  CÁLCULO DAS RAIZES A*x*x + B*x + C = 0  ");
            System.out.println("------------------------------------------");
            System.out.println("                                          ");
            System.out.print("Digite o Valor da Variável 'A': ");
            a = scan.nextInt();
            System.out.println("                                          ");
            
        if (a != 0)
        {    
            
            System.out.print("Digite o Valor da Variável 'B': ");
            b = scan.nextInt();
            System.out.println("                                          ");
            
            System.out.print("Digite o Valor da Variável 'C': ");
            c = scan.nextInt();
            System.out.println("                                          ");
            
            delta = (Math.pow(b,2) - (4 * a * c));  //A classe Math.pow(double,double) pode ser usando em substituição a b * b.
            
            if (delta > 0)
            {
                r1 = ((-(b) + (Math.sqrt(delta)))/(2*a));  //a Classe Math.sqrt(double) é usada para calcular a raiz quadrada.
                r2 = ((-(b) - (Math.sqrt(delta)))/(2*a));
                System.out.println("A Equação Possui Duas Raizes Reais Diferentes");
                System.out.println("                            ");
                System.out.printf("R1 = %.3f%n", r1);
                System.out.printf("R2 = %.3f%n", r2);            
            }   
            
            else if (delta == 0)
            {
                r1 = ((-(b) + (Math.sqrt(delta)))/(2*a));  //a Classe Math.sqrt(double) é usada para calcular a raiz quadrada.
                r2 = ((-(b) - (Math.sqrt(delta)))/(2*a));
                System.out.println("A Equação Possui uma Raiz Real Iguais");
                System.out.println("                            ");
                System.out.printf("R1 = %.3f%n", r1);
                System.out.printf("R2 = %.3f%n", r2);            
            }
            
            else if (delta < 0)
            {
                System.out.println("A Equação NÃO Possui Raizes Reais");
            }      
            
        }
        
        else
        {
            System.out.println("A Equação NÃO é de Segundo Grau!!!!");
        }
        
    }
    
}
