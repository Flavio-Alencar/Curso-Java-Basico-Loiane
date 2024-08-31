//Exercício 28 - Aula 15

//O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
//                    Até 5 Kg             Acima de 5 Kg
//File Duplo     R$ 4,90Kg por Kg         R$ 5,80 por Kg
//Alcatra        R$ 5,90 por Kg           R$ 6,80 por Kg
//Picanha        R$ 6,90 por Kg           R$ 7,80 por Kg
//Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há
//limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto
//de 5% sobre o total a compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere
//um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do
//desconto e valor a pagar.

//if - else 
//Autor: Flávio Alencar - 31AGO24 - 17h27

import java.util.Scanner; //Importando a classe Scanner

public class Ex28A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------------------------------------------
        
        double pfile1 = 4.90;           //Preço do Filé até 5Kg.
        double pfile2 = 5.80;           //Preço do Filé acima 5Kg.
        double pfilef = 0;              //Preço Final de Filé Comprado
        double palcatra1 = 5.90;        //Preço da Alcatra até 5kg.
        double palcatra2 = 6.80;        //Preço da Alcatra acima 5kg.
        double palcatraf = 0;           //Preço Final de Alcatra Comprado
        double ppicanha1 = 6.90;        //Preço da Picanha até 5kg.
        double ppicanha2 = 7.80;        //Preço da Picanha acima 5kg.
        double ppicanhaf = 0;           //Preço Final de Picanha Comprado
        double qfile = 0;               //Quantidade de Filé [Kg].
        double qalcatra = 0;            //Quantidade de Alcatra [Kg].
        double qpicanha = 0;            //Quantidade de Picanha [Kg].
        double qtotal;                  //Quantidade Total de Carne [Kg].
        double desconto = 0.05;         //Desconto de 5% na compra com Cartão.
        double vdesconto;               //Valor do Desconto [R$].
        double vtotal;                  //Valor Total da Compra [R$].
        double vtotalf;                 //Valor Total Final a ser Pago.
        int tipo;                       //Valor para o Tipo de Carne;
        int cartao;                     //Valor se a Compra for com Cartão.
                
        //----------------------------------------------------------------------
        
        System.out.print("Digite o Tipo de Carne [1 - Filé Duplo, 2 - Alcatra, 3 - Picanha]: ");
        tipo = scan.nextInt();
        System.out.println("                                                                ");
        
        System.out.print("Deseja Fazer o Pagamento com Cartão Tabajara? [1 - Sim, 2 - Não] ");
        cartao = scan.nextInt();
        System.out.println("                                                                ");
        
        switch (tipo)
        {
            case (1):
                System.out.print("Informe a Quantidade de Filé Duplo [Kg]: ");
                qfile = scan.nextDouble();
                System.out.println("                            ");
                
                if (qfile <= 5.0)
                {
                    pfilef = qfile * pfile1;
            
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                                NOTA FISCAL                                  ");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("DESCRIÇÃO %s%s%s%s%s%s%n", "               ","QTD", "     ","UNIT","     ","TOTAL");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("File Duplo [Kg] %s%.2f%s%.2f%s%.2f%n","         ",qfile,"    ", pfile1,"     ",pfilef);            
                }
                else
                {
                    pfilef = qfile * pfile2;

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                                NOTA FISCAL                                  ");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("DESCRIÇÃO %s%s%s%s%s%s%n", "               ","QTD", "     ","UNIT","     ","TOTAL");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("Filé Duplo [Kg] %s%.2f%s%.2f%s%.2f%n","         ",qfile,"    ", pfile2,"     ",pfilef);            
                } break;
                
            case (2):
                System.out.print("Informe a Quantidade de Alcatra [Kg]: ");
                qalcatra = scan.nextDouble();
                System.out.println("                            "); 
                
                if (qalcatra <= 5.0)
                {
                    palcatraf = qalcatra * palcatra1;
            
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                                NOTA FISCAL                                  ");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("DESCRIÇÃO %s%s%s%s%s%s%n", "            ","QTD", "     ","UNIT","     ","TOTAL");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("Alcatra [Kg] %s%.2f%s%.2f%s%.2f%n","         ",qalcatra,"    ", palcatra1,"     ",palcatraf);            
                }
                else
                {
                    palcatraf = qalcatra * palcatra2;

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                                NOTA FISCAL                                  ");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("DESCRIÇÃO %s%s%s%s%s%s%n", "            ","QTD", "     ","UNIT","     ","TOTAL");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("ALcatra [Kg] %s%.2f%s%.2f%s%.2f%n","         ",qalcatra,"    ", palcatra2,"     ",palcatraf);            
                } break;
               
            case (3):
                System.out.print("Informe a Quantidade de Picanha [Kg]: ");
                qpicanha = scan.nextDouble();
                System.out.println("                            "); 
                
                if (qpicanha <= 5.0)
                {
                    ppicanhaf = qpicanha * ppicanha1;
            
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                                NOTA FISCAL                                  ");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("DESCRIÇÃO %s%s%s%s%s%s%n", "            ","QTD", "     ","UNIT","     ","TOTAL");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("Picanha [Kg] %s%.2f%s%.2f%s%.2f%n","         ",qpicanha,"    ", ppicanha1,"     ",ppicanhaf);            
                }
                else
                {
                    ppicanhaf = qpicanha * ppicanha2;

                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("                                NOTA FISCAL                                  ");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("DESCRIÇÃO %s%s%s%s%s%s%n", "            ","QTD", "     ","UNIT","     ","TOTAL");
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.printf("Picanha [Kg] %s%.2f%s%.2f%s%.2f%n","         ",qpicanha,"    ", ppicanha2,"     ",ppicanhaf);            
                } break;
                
            default: System.out.println("CÓDIGO INVÁLIDO!!"); break;                
        }
        
        qtotal = qfile + qalcatra + qpicanha;
        vtotal = pfilef + palcatraf + ppicanhaf;
        
        if (cartao == 1)
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