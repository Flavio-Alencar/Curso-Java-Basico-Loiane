//Exercício 26 - Aula 15
//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//a. Álcool:
//    1. até 20 litros, desconto de 3% por litro
//    2. acima de 20 litros, desconto de 5% por litro
//Gasolina:
//    1. até 20 litros, desconto de 4% por litro
//    2. acima de 20 litros, desconto de 6% por litro.
//Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, Ggasolina),
//calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
//if - else 
//Autor: Flávio Alencar - 31AGO24 - 15h06

import java.util.Scanner; //Importando a classe Scanner

public class Ex26A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        char comb;           //Variável para o Tipo de Combustível .
        double preco;        //Variável para o Preço Final a ser Pago pelo Cliente.
        double pa = 1.90;    //Valor do Litro de Alcool.
        double da1 = 0.03;   //Desconto de 3% por litro de Alcool.
        double da2 = 0.05;   //Desconto de 5% por Litro de Alcool.
        double pg = 2.50;    //Preço do Litro de Gasolina.
        double dg1 = 0.04;   //Desconto de 4% por Litro de Gasolina.
        double dg2 = 0.06;    //Desconto de 6% por Litro de Gasolina.
        double l;            //Quantidade de Litros.
        double vd;           //Valor do Desconto.
                
        //-----------------------------------
        
        System.out.print("Informe o tipo de Combustível [A - Alcool, G - Gasolina]: ");
        comb = scan.next().charAt(0);
        System.out.println("                            ");
        
        System.out.print("Informe a Quantidade de Litros: ");
        l = scan.nextDouble();
        System.out.println("                            ");
        
        switch (comb)
        {
            case 'a':
            case 'A':
                if (l <= 20)
                {
                    vd = da1 * pa * l;
                    preco = (l * pa) - vd;
                    
                    System.out.println("--------------------------------------------------");
                    System.out.println("                  NOTA FISCAL                     ");
                    System.out.println("--------------------------------------------------");
                    System.out.println("                                          ");
                    System.out.printf("Combustível Selecionado: %s%n", "ALCOOL");
                    System.out.printf("Quantidade de Litros: %.2f%n", l);
                    System.out.printf("Valor por Litro: %s%.2f%n", "R$", pa);
                    System.out.printf("Desconto por Litro: %.2f%n", da1);
                    System.out.printf("Valor do Desconto: %s%.2f%n", "R$", vd);
                    System.out.printf("TOTAL A PAGAR: %s%.2f%n", "R$", preco);
                    }
                else
                {
                    vd = da2 * pa * l;
                    preco = (l * pa) - vd;
                    
                    System.out.println("--------------------------------------------------");
                    System.out.println("                  NOTA FISCAL                     ");
                    System.out.println("--------------------------------------------------");
                    System.out.println("                                          ");
                    System.out.printf("Combustível Selecionado: %s%n", "ALCOOL");
                    System.out.printf("Quantidade de Litros: %.2f%n", l);
                    System.out.printf("Valor por Litro: %s%.2f%n", "R$", pa);
                    System.out.printf("Desconto por Litro: %.2f%n ", da2);
                    System.out.printf("Valor do Desconto: %s%.2f%n", "R$", vd);
                    System.out.printf("TOTAL A PAGAR: %s%.2f%n", "R$", preco); 
                } break;
                
            case 'g':
            case 'G':
                if (l <= 20)
                {
                    vd = dg1 * pg * l;
                    preco = (l * pg) - vd;
                    
                    System.out.println("--------------------------------------------------");
                    System.out.println("                  NOTA FISCAL                     ");
                    System.out.println("--------------------------------------------------");
                    System.out.println("                                          ");
                    System.out.printf("Combustível Selecionado: %s%n", "GASOLINA");
                    System.out.printf("Quantidade de Litros: %.2f%n", l);
                    System.out.printf("Valor por Litro: %s%.2f%n", "R$", pg);
                    System.out.printf("Desconto por Litro: %.2f%n", dg1);
                    System.out.printf("Valor do Desconto: %s%.2f%n", "R$", vd);
                    System.out.printf("TOTAL A PAGAR: %s%.2f%n", "R$", preco);
                    }
                else
                {
                    vd = dg2 * pg * l;
                    preco = (l * pg) - vd;
                    
                    System.out.println("--------------------------------------------------");
                    System.out.println("                  NOTA FISCAL                     ");
                    System.out.println("--------------------------------------------------");
                    System.out.println("                                          ");
                    System.out.printf("Combustível Selecionado: %s%n", "GASOLINA");
                    System.out.printf("Quantidade de Litros: %.2f%n", l);
                    System.out.printf("Valor por Litro: %s%.2f%n", "R$", pg);
                    System.out.printf("Desconto por Litro: %.2f%n", dg2);
                    System.out.printf("Valor do Desconto: %s%.2f%n", "R$", vd);
                    System.out.printf("TOTAL A PAGAR: %s%.2f%n", "R$", preco); 
                } break;
                
            default: System.out.println("COMBUSTÍVEL INVÁLIDO"); break;
                
        }
           
       
    }
    
}