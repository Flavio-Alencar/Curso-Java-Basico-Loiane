package Aula13;

//Exemplo 03 - Aula 13
//Flavio Silvestre de Alencar - 23MAR26 - 16h24
//Descrição: Operadores Logicos
//------------------------------------------------------------------------------

public class Exemplo03 
{
    public static void main(String[] args)
    {
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        int valor1;
        int valor2;
        boolean resultado1;
        boolean resultado2;
        boolean verdadeiro;
        boolean falso;
        //----------------------------------------------------------------------
        
        valor1 = 1;
        valor2 = 2;
        resultado1 = (valor1 == 1) && (valor2 == 2);
        resultado2 = (valor1 == 1) || (valor2 == 2);
        verdadeiro = true;
        falso = false;
        
        System.out.println("O valor1 = 1 AND valor2 = 2: " + resultado2);
        System.out.println("O valor1 = 1 OR valor2 = 2: " + resultado2);
        System.out.println(" ");
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);      
        
        
    }
    
}
