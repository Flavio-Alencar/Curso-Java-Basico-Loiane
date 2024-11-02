//Exercício 04 - Lista 09
//Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão
//das unidades de área segundo a lista abaixo. 
//• 1 metro quadrado = 10.76 pés quadrados
//• 1 pé quadrado = 929 centímetros quadrados
//• 1 milha quadrada = 640 acres 
//• 1 acre = 43.560 pés quadrados
//Autor: Flávio Alencar - 30OUT24 - 15h26 
//Vinculado a classe ConversaoArea

package exercicios.Lista09;
import java.util.Scanner;

public class Ex04L09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean flag = false;
        while(!flag){
            
            System.out.println("          CONVERSOR DE ÁREA TABAJARA          ");
            System.out.println("----------------------------------------------");
            System.out.println("[1] Metros para Pés");
            System.out.println("[2] Pés para Centímetros");
            System.out.println("[3] Milhas para Acres");
            System.out.println("[4] Acre para Pés");
            System.out.println("[0] Sair");
            System.out.print("Digite a Opção Desejada: ");
            int opt = scan.nextInt();
            System.out.println();
            
            switch(opt){
                case(1): System.out.print("Digite o valor em metros [m]: ");
                         double metro = scan.nextDouble();
                         System.out.println();
                         ConversaoArea.mPp(metro);break;
            
                case(2): System.out.print("Digite o Valor em Pés [ft]: ");
                         double ft = scan.nextDouble();
                         ConversaoArea.pPc(ft);break; 
                     
                case(3): System.out.print("Digite o Valor em Milhas [mi]: ");
                         double mi = scan.nextDouble();
                         System.out.println();
                         ConversaoArea.miPacre(mi);break;
                         
                case(4): System.out.print("Digite o Valor em Acres [acre]): ");
                         double acre = scan.nextDouble();
                         System.out.println();
                         ConversaoArea.acrePp(acre);break;
                         
                case(0): flag = true; break;
                
                default: System.out.println("Opção Inválida");
            }
        }
    }
    
}
