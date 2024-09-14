//Exercício 04 - Aula 17

//Supondo que a população de um país A seja da ordem de 80000 habitantes com uma
//taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes 
//com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o 
//número de anos necessários para que a população do país A ultrapasse ou iguale
//a população do país B, mantidas as taxas de crescimento.

//Method: do 
//Autor: Flávio Alencar - 13SET24 - 10h45 AM

public class Ex04A17
{
    public static void main (String[] args)
    {
        //                                Variables
        //----------------------------------------------------------------------
        int a = 80000;               //Country A with a 80000 population.
        int b = 200000;              //Country B with a 200000 population.
        double ta = 1.03;            //Increasing Tax of 3% per year of Country A.
        double tb = 1.015;           //Increasing Tax of 1.5% per year of Country B.
        int year = 0;                //Number of Years.
        //----------------------------------------------------------------------
        
        do
        {
            a *= ta;
            b *= tb;
            ++year;
            
        } while (a < b);
        
        System.out.printf("Em %d%s%s%n", year," anos", " o país A ultrapassará a população do país B");
        
    }
    
}
