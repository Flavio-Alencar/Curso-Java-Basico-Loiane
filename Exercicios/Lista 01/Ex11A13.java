//Exercício 11 - Aula 13

import java.util.Scanner;

public class Ex11A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
          System.out.println("Digite um Número Inteiro: ");
          int n1 = scan.nextInt();
          System.out.println("Digite outro Número Inteiro: ");
          int n2 = scan.nextInt();
          System.out.println("Digite um Número Real: ");
          double n3 = scan.nextDouble();
          int a = (2*n1)*(n2/2);
          double b = (3*n1)+n3;
          double c = Math.pow(n3,3);
          System.out.println("                              ");
          System.out.println("Resposta da Letra a: " +a);
          System.out.println("Resposta da Letra b: " +b);
          System.out.println("Resposta da Letra c: " +c);
            
    
    }
    
}
