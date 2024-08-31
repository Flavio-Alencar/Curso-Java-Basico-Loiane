//Exercício 25 - Aula 15
//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//a. "Telefonou para a vítima?"
//b. "Esteve no local do crime?"
//c. "Mora perto da vítima?"
//d. "Devia para a vítima?"
//e. "Já trabalhou com a vítima?" 
//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões 
//ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
//if - else 
//Autor: Flávio Alencar - 31AGO24 - 14h37

import java.util.Scanner; //Importando a classe Scanner

public class Ex25A15
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        int q1;               //Resposta da Questão 01.
        int q2;               //Resposta da Questão 02. 
        int q3;               //Resposta da Questão 03.
        int q4;               //Resposta da Questão 04.
        int q5;               //Resposta da Questão 05.
        int cont = 0;         //Contador para as Questõe
                
        //-----------------------------------
        
        System.out.print("Telefonou para a vítima? [1 - Sim, 2 - Não]: ");
        q1 = scan.nextInt();
        System.out.println("                            ");
        
        switch (q1)
        {
            case (1): cont = ++cont; break;
            case (2): cont = cont + 0; break;
            default: System.out.println("Número inválido"); break;
        }
        
        System.out.print("Esteve no local do crime? [1 - Sim, 2 - Não]: ");
        q2 = scan.nextInt();
        System.out.println("                            ");
        
        switch (q2)
        {
            case (1): cont = ++cont; break;
            case (2): cont = cont + 0; break;
            default: System.out.println("Número inválido"); break;
        }
        
        System.out.print("Mora perto da vítima? [1 - Sim, 2 - Não]: ");
        q3 = scan.nextInt();
        System.out.println("                            ");
        
        switch (q3)
        {
            case (1): cont = ++cont; break;
            case (2): cont = cont + 0; break;
            default: System.out.println("Número inválido"); break;
        }
        
        System.out.print("Devia para a vítima? [1 - Sim, 2 - Não]]: ");
        q4 = scan.nextInt();
        System.out.println("                            ");
        
        switch (q4)
        {
            case (1): cont = ++cont; break;
            case (2): cont = cont + 0; break;
            default: System.out.println("Número inválido"); break;
        }
        
        System.out.print("Já trabalhou com a vítima? [1 - Sim, 2 - Não]: ");
        q5 = scan.nextInt();
        System.out.println("                            ");
        
        switch (q5)
        {
            case (1): cont = ++cont; break;
            case (2): cont = cont + 0; break;
            default: System.out.println("Número inválido"); break;
        }
                
        if (cont <= 1)
        {
            System.out.println("INOCENTE");
        }
        else if (cont == 2)
        {
            System.out.println("SUSPEITA");
        }
        else if (cont == 3 || cont == 4)
        {
            System.out.println("CÚMPLICE");
        }
        else if (cont == 5)
        {
            System.out.println("ASSASSINO");
        }      
       
    }
    
}