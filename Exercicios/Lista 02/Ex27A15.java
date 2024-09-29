//Exercício 27 - Aula 15

//Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//                Até 5 Kg            Acima de 5 Kg
//  Morango    R$ 2,50 por Kg        R$ 2,20 por Kg
//  Maçã       R$ 1,80 por Kg        R$ 1,50 por Kg
//
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de
//10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas 
//e escreva o valor a ser pago pelo cliente.

//if - else 
//Autor: Flávio Alencar - 31AGO24 - 16h12

import java.util.Scanner; //Importando a classe Scanner

public class Ex27A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double pmorango1 = 2.50;        //Preço do Morango até 5Kg.
        double pmorango2 = 2.20;        //Preço do Morango Acima de 5kg.
        double pmorangof;               //Preço Final de Morangos Comprados
        double pmaca1 = 1.80;           //Preço da Maçã até 5kg.
        double pmaca2 = 1.50;           //Preço da Maçã acima de 5kg.
        double pmacaf;                  //Preço Final de Maçãs Comprados
        double qmorango;                //Quantidade de Morango [Kg].
        double qmaca;                   //Quantidade de Maçã [Kg].
        double qtotal;                  //Quantidade Total de Frutas [Kg].
        double desconto = 0.10;         //Desconto de 10%.
        double vdesconto;               //Valor do Desconto [R$].
        double vtotal;                  //Valor Total da Compra [R$].
        double vtotalf;                 //Valor Total Final a ser Pago.
                
        //-----------------------------------
        
        System.out.print("Informe o Peso do Morango [Kg]: ");
        qmorango = scan.nextDouble();
        System.out.println("                            ");
        
        System.out.print("Informe o Peso de Maçã [Kg]: ");
        qmaca = scan.nextDouble();
        System.out.println("                            ");
        
        qtotal = qmorango + qmaca;
        
        if (qmorango <= 5.0)
        {
            pmorangof = qmorango * pmorango1;
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                                NOTA FISCAL                                  ");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("DESCRIÇÃO %s%s%s%s%s%s%n", "            ","QTD", "     ","UNIT","     ","TOTAL");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("Morango [Kg] %s%.2f%s%.2f%s%.2f%n","         ",qmorango,"    ", pmorango1,"     ",pmorangof);            
        }
        else
        {
            pmorangof = qmorango * pmorango2;

            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("                                NOTA FISCAL                                  ");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("DESCRIÇÃO %s%s%s%s%s%s%n", "            ","QTD", "     ","UNIT","     ","TOTAL");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("Morango [Kg] %s%.2f%s%.2f%s%.2f%n","         ",qmorango,"    ", pmorango2,"     ",pmorangof);            
        }
        
        if (qmaca <= 5.0)
        {
            pmacaf = qmaca * pmaca1;

            System.out.printf("Maçã [Kg] %s%.2f%s%.2f%s%.2f%n","            ",qmaca,"    ", pmaca1,"     ",pmacaf);
        }
        else
        {
            pmacaf = qmaca * pmaca2;

            System.out.printf("Maçã [Kg] %s%.2f%s%.2f%s%.2f%n","            ",qmaca,"    ", pmaca2,"     ",pmacaf);
        }
        
        vtotal = pmorangof + pmacaf;
        
        if (qtotal >= 8.0 || vtotal >= 25.00)
        {
            vdesconto = desconto * vtotal;
            vtotalf = vtotal - vdesconto;
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("Qtde Total de Itens [Kg]: %s%.2f%n","                                 ", qtotal);
            System.out.printf("Valor [R$]: %s%.2f%n","                                               ", vtotal);
            System.out.printf("Desconto [R$]: %s%.2f%n","                                            ", vdesconto);
            System.out.printf("TOTAL A PAGAR [R$] %s%.2f%n","                                        ",vtotalf);    
        }
        else
        {
            vdesconto = 0;
            vtotalf = vtotal - vdesconto;
            
            System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("Qtde Total de Itens [Kg]: %s%.2f%n","                                 ", qtotal);
            System.out.printf("Valor [R$]: %s%.2f%n","                                               ", vtotal);
            System.out.printf("Desconto [R$]: %s%.2f%n","                                            ", vdesconto);
            System.out.printf("TOTAL A PAGAR [R$] %s%.2f%n","                                        ",vtotalf);
        }
       
    }
    
}