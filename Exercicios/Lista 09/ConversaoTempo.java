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

package exercicios.Lista09;

public class ConversaoTempo {
    
    public static boolean minPseg(double n1){
        double conv = n1 * 60;
        System.out.println(+n1 +" minutos = " +conv +" segundos");
        System.out.println();
        return true;        
    }
    
    public static boolean hPmin(double n1){
        double conv = n1 * 60;
        System.out.println(+n1 +" horas = " +conv +" minutos");
        System.out.println();
        return true;        
    }
    
    public static boolean dPh(double n1){
        double conv = n1 * 24;
        System.out.println(+n1 +" dia(s) = " +conv +" hora(s)");
        System.out.println();
        return true;        
    }
    
    public static boolean semPdia(double n1){
        double conv = n1 * 7;
        System.out.println(+n1 +" semana(s) = " +conv +" dia(s)");
        System.out.println();
        return true;        
    }
    
    public static boolean mesPdia(double n1){
        double conv = n1 * 30;
        System.out.println(+n1 +" mes(es) = " +conv +" dia(s)");
        System.out.println();
        return true;        
    }
    
    public static boolean anoPdia(double n1){
        double conv = n1 * 365.25;
        System.out.println(+n1 +" ano(s) = " +conv +" dia(s)");
        System.out.println();
        return true;        
    }
    
}
