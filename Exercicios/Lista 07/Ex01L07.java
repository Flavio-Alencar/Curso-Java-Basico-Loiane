//Exercício 01 - Lista 07
//Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar,
//desligar a lampada.
//Autor: Flávio Alencar - 18OUT24 - 15h32
//Vinculada a Classe Lampada.

package exercicios.Lista07;
import java.util.Scanner;

public class Ex01L07 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        Lampada lamp1 = new Lampada();
        
        lamp1.modelo = "BG-45";
        lamp1.tensao = "220";
        lamp1.cor = "Amarelo";
        lamp1.tipoLuz = "Incandecente";
        lamp1.tipos = "Bolinha";
        lamp1.potencia = 40;
        lamp1.garantiaMeses = 12;
        lamp1.tipoAbajur = false;
        
        boolean flag = false;
        
        System.out.println("Especificações da Lâmpada");
        System.out.println();
        System.out.println("Modelo: " +lamp1.modelo);
        System.out.println("Tensão: " +lamp1.tensao);
        System.out.println("Cor: " +lamp1.cor);
        System.out.println("Tipo de Luz: " +lamp1.tipoLuz);
        System.out.println("Tipo: " +lamp1.tipos);
        System.out.println("Potência: " +lamp1.potencia +" W");
        System.out.println("Garantia: " +lamp1.garantiaMeses +" meses");
        System.out.println();
        
        while (!flag)
        {
            System.out.print("Digite [1] para Ligar, [2] Para Desligar ou [0] para Sair: ");
            int count = scan.nextInt();
            System.out.println("");
            
            switch (count)
            {
                case 1: lamp1.ligarLampada(); break;
                case 2: lamp1.desligarLampada(); break;
                case 0: flag = true; break;
                default: System.out.println("Opção Inválida");
            }
            
        }
        
        
        
    }
    
}
