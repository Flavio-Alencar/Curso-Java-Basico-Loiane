//Exercício 07 - Aula 13

import java.util.Scanner;

public class Ex7A13 {
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite o Valor do Lado do Quadrado (cm)");
    int lado = scan.nextInt();
    //double area = lado * lado;
    double area = Math.pow(lado, 2);
    double dobroArea = 2 * area;
    
    System.out.println("                        ");
    System.out.println("O Valor da Área: " +area);
    System.out.println("O Dobro da Área é igual: " +dobroArea);
    
    }
    
}
