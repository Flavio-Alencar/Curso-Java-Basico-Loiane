//Exercício 12 - Aula 15

//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
//que depende dosalário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, 
//mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o
//valor da sua hora e a quantidade de horas trabalhadas no mês.
//Usando o Comando if - else
//Autor: Flávio Alencar - 28AGO24 - 22h20

import java.util.Scanner; //Importando a classe Scanner 

public class Ex12A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        double vht;              //Valor da hora de trabalho.
        double horaTrabalho;     //Valor da Quantidade de Horas Trabalhadas.
        double salariobruto;     //Valor do Salário Bruto.
        double salarioir;        //Desconto do Imposto de Renda no Salário (R$).
        double salariosindicato; //Valor do Desconto para o Sindicato (R$).
        double salarioinss;      //Valor do Desconto do INSS (R$).
        double salariofgts;      //Valor do Desconto do FGTS (R$) não é descontado do Salário, pois é a Empresa que paga.
        double desconto;         //Valor do Descontos do Salário Bruto (Imposto de Renda + Sindicato + INSS)
        double salarioliquido;   //Valor do Salário Líquido (R$).
        double ir1 = 0.0;        //Valor do Imposto de Renda 1 (isento).
        double ir2 = 0.05;       //Valor do Importo de Renda 2 (5%).
        double ir3 = 0.10;       //Valor do Imposto de Renda 3 (10%).
        double ir4 = 0.20;       //Valor do Imposto de Renda 4 (20%).
        double sindicato = 0.03; //Valor da Taxa do Sindicato (3%).
        double fgts = 0.11;      //Valor do FGTS (11%).
        double inss = 0.10;      //Valor da Taxa do INSS (10%).
        
        //-----------------------------------
        
        System.out.print("Digite o Valor da Hora de Trabalho (R$): ");
        vht = scan.nextDouble();
        System.out.println("                                       ");
        System.out.print("Digite o Valor da Quantidade de Horas Trabalhadas no Mês: ");
        horaTrabalho = scan.nextDouble();
        System.out.println("                                       ");
        
        salariobruto = (vht * horaTrabalho);
        
        if (salariobruto <= 900.00)
        {
            salarioir = (salariobruto * ir1);
            salariosindicato = salariobruto * sindicato;
            salarioinss = salariobruto * inss;
            salariofgts = salariobruto * fgts;
            desconto = (salarioir + salariosindicato + salarioinss);
            salarioliquido = salariobruto - desconto;
            System.out.println("------------------------------------------");
            System.out.println("---------------CONTRACHEQUE---------------");
            System.out.println("------------------------------------------");
            System.out.println("Rendimentos                               ");
            System.out.printf("Valor da Hora de Trabalho: %s%.2f%n", "R$", vht);
            System.out.printf("Quantidade de Horas Trabalhadas: %.2f%n", horaTrabalho);
            System.out.printf("Salário Bruto: %s%.2f%n", "R$", salariobruto);
            System.out.println("                                          ");
            System.out.println("Descontos                                 ");
            System.out.printf("Imposto de Renda: %s%.2f%s%s%n", "R$", salarioir, " ", "Isento");
            System.out.printf("Sindicato: %s%.2f%n", "R$", salariosindicato);
            System.out.printf("INSS: %s%.2f%n", "R$", salarioinss);
            System.out.printf("FGTS: %s%.2f%n", "R$", salariofgts);
            System.out.printf("Total de Descontos: %s%.2f%n", "R$", desconto);
            System.out.printf("Salário Líquido: %s%.2f%n", "R$", salarioliquido);       
                    
        }
        
        else if (salariobruto > 900.00 && salariobruto <= 1500.00)
        {
            salarioir = salariobruto * ir2;
            salariosindicato = salariobruto * sindicato;
            salarioinss = salariobruto * inss;
            salariofgts = salariobruto * fgts;
            desconto = (salarioir + salariosindicato + salarioinss);
            salarioliquido = salariobruto - desconto;
            System.out.println("------------------------------------------");
            System.out.println("---------------CONTRACHEQUE---------------");
            System.out.println("------------------------------------------");
            System.out.println("Rendimentos                               ");
            System.out.printf("Valor da Hora de Trabalho: %s%.2f%n", "R$", vht);
            System.out.printf("Quantidade de Horas Trabalhadas: %.2f%n", horaTrabalho);
            System.out.printf("Salário Bruto: %s%.2f%n", "R$", salariobruto);
            System.out.println("                                          ");
            System.out.println("Descontos                                 ");
            System.out.printf("Imposto de Renda: %s%.2f%n", "R$", salarioir);
            System.out.printf("Sindicato: %s%.2f%n", "R$", salariosindicato);
            System.out.printf("INSS: %s%.2f%n", "R$", salarioinss);
            System.out.printf("FGTS: %s%.2f%n", "R$", salariofgts);
            System.out.printf("Total de Descontos: %s%.2f%n", "R$", desconto);
            System.out.printf("Salário Líquido: %s%.2f%n", "R$", salarioliquido);
            
        }
        
        else if (salariobruto > 1500.00 && salariobruto <= 2500.00)
        {
            salarioir = salariobruto * ir3;
            salariosindicato = salariobruto * sindicato;
            salarioinss = salariobruto * inss;
            salariofgts = salariobruto * fgts;
            desconto = (salarioir + salariosindicato + salarioinss);
            salarioliquido = salariobruto - desconto;
            System.out.println("------------------------------------------");
            System.out.println("---------------CONTRACHEQUE---------------");
            System.out.println("------------------------------------------");
            System.out.println("Rendimentos                               ");
            System.out.printf("Valor da Hora de Trabalho: %s%.2f%n", "R$", vht);
            System.out.printf("Quantidade de Horas Trabalhadas: %.2f%n", horaTrabalho);
            System.out.printf("Salário Bruto: %s%.2f%n", "R$", salariobruto);
            System.out.println("                                          ");
            System.out.println("Descontos                                 ");
            System.out.printf("Imposto de Renda: %s%.2f%n", "R$", salarioir);
            System.out.printf("Sindicato: %s%.2f%n", "R$", salariosindicato);
            System.out.printf("INSS: %s%.2f%n", "R$", salarioinss);
            System.out.printf("FGTS: %s%.2f%n", "R$", salariofgts);
            System.out.printf("Total de Descontos: %s%.2f%n", "R$", desconto);
            System.out.printf("Salário Líquido: %s%.2f%n", "R$", salarioliquido);
        }
        
        else if (salariobruto > 2500.00)
        {
            salarioir = salariobruto * ir4;
            salariosindicato = salariobruto * sindicato;
            salarioinss = salariobruto * inss;
            salariofgts = salariobruto * fgts;
            desconto = (salarioir + salariosindicato + salarioinss);
            salarioliquido = salariobruto - desconto;
            System.out.println("------------------------------------------");
            System.out.println("---------------CONTRACHEQUE---------------");
            System.out.println("------------------------------------------");
            System.out.println("Rendimentos                               ");
            System.out.printf("Valor da Hora de Trabalho: %s%.2f%n", "R$", vht);
            System.out.printf("Quantidade de Horas Trabalhadas: %.2f%n", horaTrabalho);
            System.out.printf("Salário Bruto: %s%.2f%n", "R$", salariobruto);
            System.out.println("                                          ");
            System.out.println("Descontos                                 ");
            System.out.printf("Imposto de Renda: %s%.2f%n", "R$", salarioir);
            System.out.printf("Sindicato: %s%.2f%n", "R$", salariosindicato);
            System.out.printf("INSS: %s%.2f%n", "R$", salarioinss);
            System.out.printf("FGTS: %s%.2f%n", "R$", salariofgts);
            System.out.printf("Total de Descontos: %s%.2f%n", "R$", desconto);
            System.out.printf("Salário Líquido: %s%.2f%n", "R$", salarioliquido);
        }
        
    }
    
}
