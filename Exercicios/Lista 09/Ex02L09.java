//Exercício 02/03 - Lista 09
//Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair,
//multiplicar, dividir (dois números), elevar à potência n e fatorial. Desenvolva um programa
//para testar essa classe.
//Autor: Flávio Alencar - 30OUT24 - 1h14 AM
//Vinculado a classe Calculadora

package exercicios.Lista09;
import java.util.Scanner;

public class Ex02L09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean flag = false;
        while(!flag){
            
            System.out.println("          CALCULADORA TABAJARA          ");
            System.out.println("----------------------------------------");
            System.out.println("[1] para Soma");
            System.out.println("[2] para Subtração");
            System.out.println("[3] para Multiplicação");
            System.out.println("[4] para Divisão");
            System.out.println("[5] Potência");
            System.out.println("[6] Fatorial");
            System.out.println("[0] Sair");
            System.out.print("Digite a Opção Desejada: ");
            int opt = scan.nextInt();
            System.out.println();
            
            switch(opt){
                case(1): System.out.print("Digite um Número Inteiro(N1): ");
                         int s1 = scan.nextInt();
                         System.out.println();
                         System.out.print("Digite um Número Inteiro(N2): ");
                         int s2 = scan.nextInt();
                         System.out.println();
                         Calculadora.somar(s1, s2);break;
            
                case(2): System.out.print("Digite um Número Inteiro(N1): ");
                         int sb1 = scan.nextInt();
                         System.out.println();
                         System.out.print("Digite um Número Inteiro(N2): ");
                         int sb2 = scan.nextInt();
                         System.out.println();
                         Calculadora.subtrair(sb1, sb2);break; 
                     
                case(3): System.out.print("Digite um Número Inteiro(N1): ");
                         int mult1 = scan.nextInt();
                         System.out.println();
                         System.out.print("Digite um Número Inteiro(N2): ");
                         int mult2 = scan.nextInt();
                         System.out.println();
                         Calculadora.multiplicar(mult1, mult2);break;
                         
                case(4): System.out.print("Digite um Número Inteiro(N1): ");
                         int dv1 = scan.nextInt();
                         System.out.println();
                         System.out.print("Digite um Número Inteiro(N2): ");
                         int dv2 = scan.nextInt();
                         System.out.println();
                         Calculadora.dividir(dv1, dv2);break;
                         
                case(5): System.out.print("Digite um Número Inteiro(N1) Base: ");
                         int pot1 = scan.nextInt();
                         System.out.println();
                         System.out.print("Digite um Número Inteiro(N2) Expoente: ");
                         int pot2 = scan.nextInt();
                         System.out.println();
                         Calculadora.potencia(pot1, pot2);break;
                         
                case(6): System.out.print("Digite um Número Inteiro(N1): ");
                         int ft = scan.nextInt();
                         System.out.println();
                         Calculadora.fatorial(ft);break;
                         
                case(0): flag = true; break;
                
                default: System.out.println("Opção Inválida");
            }
        }
    }
}
