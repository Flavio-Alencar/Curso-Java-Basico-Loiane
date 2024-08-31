//Exercício 21 - Aula 15
//Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas
//de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.
//Autor: Flávio Alencar - 31AGO24 - 11h06

import java.util.Scanner; //Importando a classe Scanner

public class Ex21A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        int saque;        //Valor do Saque.
        int cem;          //Valor da Quantidade de Notas de R$100,00
        int cinquenta;    //Valor da Quantidade de Notas de R$50,00.
        int dez;          //Valor da Quantidade de Notas de R$10,00.
        int cinco;        //Valor da Quantidade de Notas de R$5,00.
        int um;           //Valor da Quantidade de Notas de R$1,00.
        
        //-----------------------------------
        
        System.out.print("Digite o Valor do Saque (Minimo de R$10,00 e Máximo de R$600,00): ");
        saque = scan.nextInt();
        System.out.println("                            ");
        
        if (saque >= 10 && saque <= 600)
        {
            cem = saque/100;
            saque = saque - (cem*100);
            
            cinquenta = saque/50;
            saque = saque - (cinquenta*50);
            
            dez = saque / 10;
            saque = saque - (dez * 10);
            
            cinco = saque / 5;
            saque = saque - (cinco * 5);
            
            um = saque;
            
            System.out.println("--------------------------------------------------");
            System.out.println("             QUANTIDADE DE NOTAS                  ");
            System.out.println("--------------------------------------------------");
            System.out.println("                                          ");
            System.out.printf("%s%d%n", "Quantida de Notas de R$100,00: ", cem);
            System.out.printf("%s%d%n", "Quantida de Notas de R$50,00: ", cinquenta);
            System.out.printf("%s%d%n", "Quantida de Notas de R$10,00: ", dez);
            System.out.printf("%s%d%n", "Quantida de Notas de R$5,00: ", cinco);
            System.out.printf("%s%d%n", "Quantida de Notas de R$1,00: ", um);
        
        }
        
        else
        {
            System.out.println("Valor do Saque Inválido!!");
        }
        
    }
    
}
