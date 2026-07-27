package Aula13;

//Exemplo 04 - Aula 13
//Flavio Silvestre de Alencar - 23MAR26 - 16h24
//Descrição: Curto Circuito
//------------------------------------------------------------------------------

public class Exemplo04 
{
    public static void main(String[] args) 
    {
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        boolean verdadeiro;
        boolean falso;
        boolean resultado1;
        boolean resultado2;
        //----------------------------------------------------------------------
        
        verdadeiro = true;
        falso = false;
        resultado1 = falso & verdadeiro;
        resultado2 = falso && verdadeiro;
        
        System.out.println(resultado1);
        System.out.println(resultado2);
        
        
    }
    
}
