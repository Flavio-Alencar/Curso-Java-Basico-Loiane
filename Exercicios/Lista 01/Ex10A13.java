//Exercício 10 - Aula 13

import java.util.Scanner;

public class Ex10A13 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
          System.out.println("Conversor de Temperatura ºC para F");
          System.out.println("Digite o Valor da Temperatura em ºC");
          double tc = scan.nextDouble();
          double tf = (((9*tc)/5)+32);
          
            System.out.println("                                 ");
            System.out.println("O Valor da Temperatura em Farenheit: " +tf +"F");
            
    }
    
}
