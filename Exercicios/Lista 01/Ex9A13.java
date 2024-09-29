//Exercício 09 - Aula 13

import java.util.Scanner;

public class Ex9A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Conversor de Temperatura F para ºC");
        System.out.println("Digite o Valor da Temperatura em Farenheit (F): ");
        double fh = scan.nextDouble();
        double tc = (5*((fh-32)/9));
        
        System.out.println("                                                 ");
        System.out.println("A temperatura: " +tc +"ºC");
    }
    
}
