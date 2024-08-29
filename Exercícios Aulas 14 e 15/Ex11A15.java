//Exercício 11 - Aula 15

//As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa que
//calculará os reajustes.
//Usando o Comando if - else
//Autor: Flávio Alencar - 28AGO24 - 21h20

import java.util.Scanner; //Importando a classe Scanner

public class Ex11A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double salario;          //Valor do Salário Inicial.
        double reajuste1 = 0.2;  //Reajuste de 20%.
        double reajuste2 = 0.15; //Reajuste de 15%;
        double reajuste3 = 0.10; //Reajuste de 10%
        double reajuste4 = 0.05; //Reajuste de 5%                
        double novosalario;      //Valor do Salário Reajustado
        
        //-----------------------------------
        
        System.out.print("Digite o Valor do Seu Salário (R$): ");
        salario = scan.nextDouble();
        System.out.println("          ");
        
        if (salario <= 280.0)
        {
            novosalario = salario * (1+reajuste1);
            System.out.println("CONTRACHEQUE");
            System.out.println("--------------------------");
            System.out.println("Salário Antigo: " +"R$" +salario);
            System.out.println("Percentual de Aumento: " +((reajuste1)*100) +"%");
            System.out.println("Valor do Aumento: " +"R$" +(salario*reajuste1));
            System.out.printf("Salário Reajustado: %S%.2f%n", "R$", novosalario); //Saida Formatada(%s para a string "R$"), (%.2f para saida de duas casas decimais) (%n para pular uma linha)
            System.out.println("--------------------------");
        }
        
        else if(salario > 280.0 && salario <= 700.0)
        {
            novosalario = salario * (1+reajuste2);
            System.out.println("CONTRACHEQUE");
            System.out.println("--------------------------");
            System.out.println("Salário Antigo: " +"R$" +salario);
            System.out.println("Percentual de Aumento: " +((reajuste2)*100) +"%");
            System.out.println("Valor do Aumento: " +"R$" +(salario*reajuste2));
            System.out.printf("Salário Reajustado: %S%.2f%n", "R$", novosalario); //Saida Formatada(%s para a string "R$"), (%.2f para saida de duas casas decimais) (%n para pular uma linha)
            System.out.println("--------------------------");
        }
        
        else if (salario > 700 && salario <= 1500)
        {
            novosalario = salario * (1+reajuste3);
            System.out.println("CONTRACHEQUE");
            System.out.println("--------------------------");
            System.out.println("Salário Antigo: " +"R$" +salario);
            System.out.println("Percentual de Aumento: " +((reajuste3)*100) +"%");
            System.out.println("Valor do Aumento: " +"R$" +(salario*reajuste3));
            System.out.printf("Salário Reajustado: %S%.2f%n", "R$", novosalario); //Saida Formatada(%s para a string "R$"), (%.2f para saida de duas casas decimais) (%n para pular uma linha)
            System.out.println("--------------------------");
        }
        
        else if(salario > 1500)
        {
            novosalario = salario * (1+reajuste4);
            System.out.println("CONTRACHEQUE");
            System.out.println("--------------------------");
            System.out.println("Salário Antigo: " +"R$" +salario);
            System.out.println("Percentual de Aumento: " +((reajuste4)*100) +"%");
            System.out.println("Valor do Aumento: " +"R$" +(salario*reajuste4));
            System.out.printf("Salário Reajustado: %S%.2f%n", "R$", novosalario); //Saida Formatada(%s para a string "R$"), (%.2f para saida de duas casas decimais) (%n para pular uma linha)
            System.out.println("--------------------------");
        }
            
     }
    
}
