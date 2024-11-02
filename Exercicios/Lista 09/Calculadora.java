//Exercício 02/03 - Lista 09
//Escreva uma classe Calculadora que tenha os seguintes métodos: somar, subtrair,
//multiplicar, dividir (dois números), elevar à potência n e fatorial. Desenvolva um programa
//para testar essa classe.
//Autor: Flávio Alencar - 30OUT24 - 1h14 AM

package exercicios.Lista09;

public class Calculadora {
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private static int n1;
    private static int n2;
    //--------------------------------------------------------------------------
    
    public static boolean somar(int n1, int n2){
        int soma = n1 + n2;
        System.out.println("Soma = " +soma);
        System.out.println();
        return true;        
    }
    
    public static boolean subtrair(int n1, int n2){
        int sub = n1 - n2;
        System.out.println("Subtração = " +sub);
        System.out.println("");
        return true;        
    }
    
    public static boolean multiplicar(int n1, int n2){
        int mult = n1 * n2;
        System.out.println("Multiplicação = " +mult);
        System.out.println();
        return true;        
    }
    
    public static boolean dividir(int n1, int n2){
        double div = 0;
        if(n2 == 0){
            System.out.println("Erro, Divisão por Zero, digite Numero Diferente de Zero");
        }
        else{
            div = (double)n1/n2;
            System.out.println("Divisão = " +div);
            System.out.println();
        }
        
        return true;        
    }
    
    public static boolean potencia(int n1, int n2){
        double pot = 0;
        pot = Math.pow(n1, n2);
        System.out.println("Potência = " +pot);
        System.out.println("");
        return true;        
    }
    
    public static boolean fatorial(int n1){
        int fat = 1;    
        for(int i = 0; i < n1; i++){
            fat *= (i+1);
        }
        System.out.println(+n1 +"! = " +fat);
        return true;
    }
    
 
    
    
    
}
