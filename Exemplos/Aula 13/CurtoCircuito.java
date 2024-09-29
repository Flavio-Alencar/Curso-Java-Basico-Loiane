//Aula 13 - Curto Circuito


public class CurtoCircuito {
    public static void main(String[] args){
        
        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso & verdadeiro;
        boolean resultado2 = falso && verdadeiro;
        System.out.println(resultado1);
        System.out.println(resultado2);
        
        int resultado3 = 1 + 1 - 1 + 1 * 1 / 1;
        System.out.println(resultado3);
    }
    
}
