//Exercício 12 - Aula 13

import java.util.Scanner;

public class Ex12A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Calculo do Peso Ideal");
        System.out.println("Digite a sua Altura (m): ");
        double alt = scan.nextDouble();
        double pesoIdeal = ((72.7*alt)-58);
        System.out.println("                         ");
        System.out.println("Seu peso Ideal é igual: " +pesoIdeal +"Kg");
    }
    
}
