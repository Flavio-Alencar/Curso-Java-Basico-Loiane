//Exercício 01 - Lista 07
//Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar,
//desligar a lampada.
//Autor: Flávio Alencar - 18OUT24 - 15h32

package exercicios.Lista07;

public class Lampada
{
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    String modelo;
    String tensao;                //volts (V)
    String cor;
    String tipoLuz;
    String tipos;
    int potencia;                 //Watts (W)
    int garantiaMeses;
    boolean tipoAbajur;
    //--------------------------------------------------------------------------

void ligarLampada()
{
    System.out.println("Lampada: ON!");
}

void desligarLampada()
{
    System.out.println("Lampada: OFF!");    
}

}