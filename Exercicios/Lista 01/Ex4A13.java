//Exercício 04 - Aula 13

import java.util.Scanner;

public class Ex4A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o balor da Nota 1: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite o balor da Nota 2: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite o balor da Nota 3: ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite o balor da Nota 4: ");
        double nota4 = scan.nextDouble();
        
        System.out.println("                          ");
        System.out.println("A Médias das Notas é Igual a: " +((nota1+nota2+nota3+nota4)/4));
    }
    
}
