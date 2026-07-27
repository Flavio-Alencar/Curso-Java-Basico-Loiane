package Aula13;

//Exemplo 01 - Aula 13
//Flavio Silvestre de Alencar - 23MAR26 - 11h46
//Descrição: Operadores Aritméticos
//------------------------------------------------------------------------------

public class Exemplo01 
{
    public static void main(String[] args) 
    {
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        int resultado;
        String primeiroNome;
        String segundoNome;
        String terceiroNome;
        //----------------------------------------------------------------------
        
        resultado = 1 + 2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado = resultado * 2;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado = resultado % 7;
        System.out.println(resultado);
        
        primeiroNome = "Esta é";
        segundoNome = " uma String concatenada";
        terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        
        resultado = resultado + 1;
        System.out.println(resultado);
        
        resultado++;
        System.out.println(resultado);
        System.out.println(resultado++);
        System.out.println(++resultado);
        
        resultado--;
        System.out.println(resultado);
        System.out.println(resultado--);
        System.out.println(--resultado);
        
        
    }
    
}
