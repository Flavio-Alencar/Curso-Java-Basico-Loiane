//Exercício 05 - Lista 09
//Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para conversão
//das unidades de Volume segundo a lista abaixo. 
//• 1 litro = 1000 centímetros cúbicos
//• 1 metro cúbico = 1000 litros
//• 1 metro cúbico = 35.32 pés cúbicos
//• 1 galão americano = 231 polegadas cúbicas
//• 1 galão americano = 3.785 litros
//Autor: Flávio Alencar - 30OUT24 - 16h03

package exercicios.Lista09;
import java.util.Scanner;

public class Ex05L09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean flag = false;
        while(!flag){
            
            System.out.println("          CONVERSOR DE ÁREA TABAJARA          ");
            System.out.println("----------------------------------------------");
            System.out.println("[1] Litros para Centimetros Cúbicos");
            System.out.println("[2] Metro Cúbico para Litros");
            System.out.println("[3] Metro Cúbico para Pés Cúbicos");
            System.out.println("[4] Galão para Polegadas Cúbicas");
            System.out.println("[5] Galão para Litros");
            System.out.println("[0] Sair");
            System.out.print("Digite a Opção Desejada: ");
            int opt = scan.nextInt();
            System.out.println();
            
            switch(opt){
                case(1): System.out.print("Digite o valor em Litros [L]: ");
                         double litro = scan.nextDouble();
                         System.out.println();
                         ConversaoVolume.lPcm(litro);break;
            
                case(2): System.out.print("Digite o Valor em Metro Cúbico [m]: ");
                         double mc = scan.nextDouble();
                         ConversaoVolume.mPl(mc);break; 
                     
                case(3): System.out.print("Digite o Valor em Metro Cúbico [m]: ");
                         double mc1 = scan.nextDouble();
                         System.out.println();
                         ConversaoVolume.mPp(mc1);break;
                         
                case(4): System.out.print("Digite o Valor em Galão [gal]: ");
                         double gal = scan.nextDouble();
                         System.out.println();
                         ConversaoVolume.gPin(gal);break;
                         
                case(5): System.out.print("Digite o Valor em Galão [gal]: ");
                         double gal1 = scan.nextDouble();
                         System.out.println();
                         ConversaoVolume.gPl(gal1);break;
                         
                case(0): flag = true; break;
                
                default: System.out.println("Opção Inválida");
            }
        }
    }
    
}
