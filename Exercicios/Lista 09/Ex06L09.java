//Exercício 06 - Lista 09
//Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para conversão
//das unidades de Volume segundo a lista abaixo. 
//• 1 minuto = 60 segundos 
//• 1 hora = 60 minutos 
//• 1 dia = 24 horas
//• 1 semana = 7 dias
//• 1 mês = 30 dias
//• 1 ano = 365.25 dias
//Autor: Flávio Alencar - 30OUT24 - 15h49
//Vinculado a classe ConversaoTempo

package exercicios.Lista09;
import java.util.Scanner;

public class Ex06L09{
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        boolean flag = false;
        while(!flag){
            
            System.out.println("          CONVERSOR DE ÁREA TABAJARA          ");
            System.out.println("----------------------------------------------");
            System.out.println("[1] Minutos para segundos [s]");
            System.out.println("[2] Horas para minutos [min]");
            System.out.println("[3] Dias para Horas [h]");
            System.out.println("[4] Semana para Dias [dias]");
            System.out.println("[5] Mês para Dias [dias]");
            System.out.println("[6] Ano para Dias [dias]");
            System.out.println("[0] Sair");
            System.out.print("Digite a Opção Desejada: ");
            int opt = scan.nextInt();
            System.out.println();
            
            switch(opt){
                case(1): System.out.print("Digite o valor em Minutos [min]: ");
                         double min = scan.nextDouble();
                         System.out.println();
                         ConversaoTempo.minPseg(min); break;
            
                case(2): System.out.print("Digite o Valor em Horas [h]: ");
                         double h = scan.nextDouble();
                         ConversaoTempo.hPmin(h);break; 
                     
                case(3): System.out.print("Digite o Valor em Dias [dias]: ");
                         double dia = scan.nextDouble();
                         System.out.println();
                         ConversaoTempo.dPh(dia);break;
                         
                case(4): System.out.print("Digite o Valor em Semanas [sem]: ");
                         double sem = scan.nextDouble();
                         System.out.println();
                         ConversaoTempo.semPdia(sem);break;
                         
                case(5): System.out.print("Digite o Valor em Mes(es) [mes]: ");
                         double mes = scan.nextDouble();
                         System.out.println();
                         ConversaoTempo.mesPdia(mes);break;
                         
                case(6): System.out.print("Digite o Valor em Ano(s) [ano]: ");
                         double ano = scan.nextDouble();
                         System.out.println();
                         ConversaoTempo.anoPdia(ano);break;         
                         
                case(0): flag = true; break;
                
                default: System.out.println("Opção Inválida");
            }
        }
    
    }

}
