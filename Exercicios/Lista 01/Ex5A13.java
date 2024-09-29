//Exercício 05 - Aula13

import java.util.Scanner;

public class Ex5A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Valor em Metros: ");
        double valor1 = scan.nextDouble();
        
        System.out.println("                          ");
        System.out.println("O Valor em Centímetros é: " +(valor1*100) +"cm");
        
    }
    
}
