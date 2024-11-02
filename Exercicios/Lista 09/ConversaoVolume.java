//Exercício 05 - Lista 09
//Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para conversão
//das unidades de Volume segundo a lista abaixo. 
//• 1 litro = 1000 centímetros cúbicos
//• 1 metro cúbico = 1000 litros
//• 1 metro cúbico = 35.32 pés cúbicos
//• 1 galão americano = 231 polegadas cúbicas
//• 1 galão americano = 3.785 litros
//Autor: Flávio Alencar - 30OUT24 - 15h49

package exercicios.Lista09;

public class ConversaoVolume {
    
    public static boolean lPcm(double n1){
        double conv = n1 * 1000;
        System.out.println(+n1 +" Litros = " +conv +" Centímetros Cúbicos");
        System.out.println();
        return true;        
    }
    
    public static boolean mPl(double n1){
        double conv = n1 * 1000;
        System.out.println(+n1 +" metros cúbicos = " +conv +" Litros");
        System.out.println();
        return true;        
    }
    
    public static boolean mPp(double n1){
        double conv = n1 * 35.32;
        System.out.println(+n1 +" metros cúbicos = " +conv +" pés cúbicos");
        System.out.println();
        return true;        
    }
    
    public static boolean gPin(double n1){
        double conv = n1 * 231;
        System.out.println(+n1 +" galões = " +conv +" polegadas cúbicas");
        System.out.println();
        return true;        
    }
    
    public static boolean gPl(double n1){
        double conv = n1 * 3.785;
        System.out.println(+n1 +" galões = " +conv +" Litros");
        System.out.println();
        return true;        
    }
    
}
