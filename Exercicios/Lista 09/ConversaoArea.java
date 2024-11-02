//Exercício 04 - Lista 09
//Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para conversão
//das unidades de área segundo a lista abaixo. 
//• 1 metro quadrado = 10.76 pés quadrados
//• 1 pé quadrado = 929 centímetros quadrados
//• 1 milha quadrada = 640 acres 
//• 1 acre = 43.560 pés quadrados
//Autor: Flávio Alencar - 30OUT24 - 15h26 

package exercicios.Lista09;

public class ConversaoArea {
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private static int n1;
    //--------------------------------------------------------------------------
    
    public static boolean mPp(double n1){
        double conv = n1 * 10.76;
        System.out.println(+n1 +" metros quadrados = " +conv +" pés quadrados");
        System.out.println();
        return true;        
    }
    
    public static boolean pPc(double n1){
        double conv = n1 * 929;
        System.out.println(+n1 +" pés quadrados = " +conv +" centímetros quadrados");
        System.out.println();
        return true;        
    }
    
    public static boolean miPacre(double n1){
        double conv = n1 * 640;
        System.out.println(+n1 +" milhas quadradas = " +conv +" acres");
        System.out.println();
        return true;        
    }
    
    public static boolean acrePp(double n1){
        double conv = n1 * 43.56;
        System.out.println(+n1 +" acres = " +conv +" pés quadrados");
        System.out.println();
        return true;        
    }
    
}
