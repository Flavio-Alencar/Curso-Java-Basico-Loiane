//Exercício 03 - Aula 13

import java.util.Scanner;

public class Ex3A13 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o balor da Nota 1: ");
        double nota1 = scan.nextDouble();
        
        System.out.println("Digite o balor da Nota 2: ");
        double nota2 = scan.nextDouble();
        
        System.out.println("A Soma da Nota 1 com a Nota 2 é: " +(nota1 + nota2));
        
    }
    
}
