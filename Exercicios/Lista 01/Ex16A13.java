//Exercício 16 - Aula 13

import java.util.Scanner;

public class Ex16A13 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite em metros quadrados a Área a ser pintada: ");
        double area = scan.nextDouble();
        double areaTotal = area*1.1;
        double latas = areaTotal/54;
        int qntLatas = (int)latas;
        System.out.println("                                     ");
        
        if (qntLatas <= 1){
            System.out.println("Quantidade de Latas: 01");
            System.out.println("Valor Total: " +"R$80.00");
        }
        else{
            double valorTotal = 80*qntLatas;
            System.out.println("Quantidade de Latas: " +qntLatas);
            System.out.println("Valor Total: " +"R$" +valorTotal);
        }
            
        }        
    }
    

