//Exercício 06 - AUla 13

import java.util.Scanner;

public class Ex6A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cálculo da Área de um Círculo");
        System.out.println("                             ");
        System.out.println("Digite o balor do raio (cm): ");
        double raio = scan.nextDouble();
        double pi = 3.1416;
        double area = Math.PI * Math.pow(raio, 2);
        //area = pi*(raio*raio);
        System.out.println("                             ");
        System.out.println("Digite o Valor da Área: " +area +" " +"cm*cm");
    }
    
}
