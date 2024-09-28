//Exemple 01 - Aula 19
//Loiane Training - Java Basic Course
//Edited by Flávio Alencar
//Date: 25SET24 - 16h16 


public class Exemplo01
{
    public static void main(String[] args) 
    {
        //                    DECLARAÇÃO DE VARIÁVEIS
        //----------------------------------------------------------------------
        double [] temperaturas = new double[365];
        //----------------------------------------------------------------------
        
        temperaturas [0] = 20.4;
        temperaturas [1] = 21.3;
        temperaturas [2] = 20.6;
        temperaturas [3] = 21.0;
        temperaturas [4] = 20.2;
        
        for (int i = 0; i < temperaturas.length; i++)
        {
            System.out.println("O Valor da Temperatura do dia " +(i+1) +" é: " +temperaturas[i]);
        }
               
    }
}
