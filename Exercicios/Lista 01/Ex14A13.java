//Exercício 14 - Aula 13

import java.util.Scanner;

public class Ex14A13 {
    public static void main (String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Peso de Peixes Pescados (kg): ");
        double peso = scan.nextDouble();
        float limite = 50.0f;
        double multa = 4*(peso - limite);
        
        if (multa <= 0){
            System.out.println("Multa a Pagar: R$0,00");
        }
        else{
            System.out.println("Multa a Pagar: " +"R$" +multa);
        }
            
        }
        
    }
    

