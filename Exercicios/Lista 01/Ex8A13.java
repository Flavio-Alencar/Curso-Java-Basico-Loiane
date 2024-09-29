//Exercício 08 - Aula 13

import java.util.Scanner;

public class Ex8A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Valor da sua hora/aula R$: ");
        double horaAula = scan.nextDouble();
        System.out.println("Digite a Quantidade de Horas Trabalhadas nesse Mês: ");
        double hora = scan.nextDouble();
        double salario = horaAula * hora;
        
        System.out.println("                                                    ");
        System.out.println("O Salário desse mês será: " +"R$" +salario);
        
                
        
    }
    
}
