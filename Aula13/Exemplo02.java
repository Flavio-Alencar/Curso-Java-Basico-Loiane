package Aula13;

//Exemplo 02 - Aula 13
//Flavio Silvestre de Alencar - 23MAR26 - 16h24
//Descrição: Operadores Relacionais
//------------------------------------------------------------------------------

public class Exemplo02
{
    public static void main(String[] args)
    {
        //Declaração de Varáveis
        //----------------------------------------------------------------------
        int valor1;
        int valor2;
        //----------------------------------------------------------------------
        
        valor1 = 1;
        valor2 = 2;
        
        System.out.println("Valor1 igual a valor 2: " + (valor1 == valor2));
        System.out.println("Valor1 diferente a valor 2: " + (valor1 != valor2));
        System.out.println("Valor1 maior que valor 2: " + (valor1 > valor2));
        System.out.println("Valor1 igual ou igual a valor 2: " + (valor1 >= valor2));
        System.out.println("Valor1 menor que valor 2: " + (valor1 < valor2));
        System.out.println("Valor1 menor ou igual a valor 2: " + (valor1 <= valor2));
        
    }
    
}
