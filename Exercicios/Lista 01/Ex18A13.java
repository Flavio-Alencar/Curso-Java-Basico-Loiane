//Exercício 18 - Aula 13

import java.util.Scanner;

public class Ex18A13 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Tamanho do Arquivo em MB:");
        double arq = scan.nextDouble();
        System.out.println("Digite o Valor da Taxa de Transmissão (MBPS):");
        double tt = scan.nextDouble();
        double tempoS = arq/tt;
        double tempoMin = tempoS/60;
         System.out.println("                                            ");
         
         System.out.println("Tempo de Download: " +tempoMin +"min");
         System.out.println("Tempo de Download: " +tempoS +"sec");
        
    }
    
}
