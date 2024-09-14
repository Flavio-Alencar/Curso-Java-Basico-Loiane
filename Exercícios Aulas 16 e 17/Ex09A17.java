//Exercício 09 - Aula 17

//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
//Method: do - while - if - else - for
//Autor: Flávio Alencar - 13SET24 - 22h17

public class Ex09A17 
{
    public static void main (String[] args)
    {
         //                             Variaveis
        //-----------------------------------------------------------------------------------
        int num = 1;                              //Variável que armazena o valor digitado.
        int resto = 0;                            //Variável que armazena a soma dos números.
        int i = 0;                                //Contador.
        //-----------------------------------------------------------------------------------
        
        do
        {
            resto = num % 2;
            
            if (resto != 0)
            {
                System.out.println(num);
            }
            
            ++num;
            i++;
            
        } while (i < 50);
    }
    
}
