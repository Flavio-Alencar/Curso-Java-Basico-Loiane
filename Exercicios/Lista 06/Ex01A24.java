//Exercício 01 - Aula 24
//Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
//Autor: Flávio Alencar - 16OUT24 - 18h45

package exercicios.Lista06;

public class Ex01A24 
{
    public static void main (String[] args)
    {
        Lampada lamp1 = new Lampada();
        
        lamp1.tipo = "Inteligente e LED";
        lamp1.formato = "Bolinha";
        lamp1.cor = "RGB";
        lamp1.marca = "Elgin" ;
        lamp1.potencia = 10;
        lamp1.fluxoLuminoso = 803;
    }
    
}
