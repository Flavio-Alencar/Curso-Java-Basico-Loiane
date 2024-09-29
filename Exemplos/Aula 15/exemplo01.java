//Exemplo 01 - Aula 15

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Dia da Semana:");
        int dia = scan.nextInt();
        
        /*if (dia == 1){
            System.out.println("Domingo");
            }
        else if (dia == 2){
            System.out.println("Segunda");
            }
        else if (dia == 3){
            System.out.println("Terça-Feira");
            }
        else if (dia == 4){
            System.out.println("Quarta-Feira");
            }
        else if (dia == 5){
            System.out.println("Quinta-Feira");
            }
        else if (dia == 6){
            System.out.println("Sexta-Feira");
            }
        else if (dia == 7){
            System.out.println("Sábado");
            }
        else {
        System.out.println("Não é um Dia da Semana Válido");
        }*/
        
        switch(dia){
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça-Feira"); break;
            case 4: System.out.println("Quarta-Feira"); break;
            case 5: System.out.println("Quinta-Feira"); break;
            case 6: System.out.println("Sexta-Feira"); break;
            case 7: System.out.println("Sábabo"); break;
            default: System.out.println("Não é um Dia da Semana Válido!!"); break;
        }
    }
}
