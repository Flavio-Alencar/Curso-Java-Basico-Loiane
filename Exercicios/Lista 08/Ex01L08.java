//Exercício 01 - Lista 08
//Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, 
//métodos getters e setters e construtores. Os métodos que serão utilizados pela
//classe de teste devem ser públicos. Se necessário, crie métodos privados como
//auxiliares para organizar melhor o código fonte também. 
//Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar,
//desligar a lampada.
//Autor: Flávio Alencar - 26OUT24 - 10h50 AM
//Vinculada a classe Lampada.

package exercicios.Lista08;
import java.util.Scanner;

public class Ex01L08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Lampada lamp1 = new Lampada();
        
        System.out.print("Digite o Modelo: ");
        String modelo = scan.next();
        lamp1.setModelo(modelo);
        System.out.println("");
        
        System.out.print("Digite a Tensão: ");
        String tensao = scan.next();
        lamp1.setTensao(tensao);
        System.out.println("");
        
        System.out.print("Digite a Cor da Luz: ");
        String cor = scan.next();
        lamp1.setCor(cor);
        System.out.println("");
        
        System.out.print("Digite o Tipo de Luz: ");
        String tipoLuz = scan.next();
        lamp1.setTipoLuz(tipoLuz);
        System.out.println("");
        
        System.out.print("Digite a Potência: ");
        int potencia = scan.nextInt();
        lamp1.setPotencia(potencia);
        System.out.println("");
        
        boolean flag = false;
        while(!flag){
            System.out.print("Digite [1] se a Lampada for do Tipo Abajur e [2] se Não: ");
            int abajur = scan.nextInt();
            if(abajur == 1){
                lamp1.setTipoAbajur(true);
                flag = true;
            }
            else if (abajur == 2){
                lamp1.setTipoAbajur(false);
                flag = true;
            }
            else{
                System.out.println("Opção Inválida, Digite Novamente!");
            }
            System.out.println();
        }

    lamp1.ImprimirCaracteristicas();
        
        boolean flag1 = false;
        while (!flag1){
            System.out.println("Digite [1] para Ligar, [2] para Desligar e [0] para Sair");
            int cont = scan.nextInt();
            
            switch (cont){
                case (1): lamp1.Ligarlampada();
                          System.out.println("");
                          break;
                case (2): lamp1.DesligarLampada();
                          System.out.println("");
                          break;
                case (0): flag1 = true;
                          break;
                default: System.out.println("Opção Inválida, Digite Novamente");
                         System.out.println("");
                         break;
            }
        }
    }
}
