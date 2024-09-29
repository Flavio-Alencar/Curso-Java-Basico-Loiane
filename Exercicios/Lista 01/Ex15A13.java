//Exercício 15 - Aula 13

import java.util.Scanner;

public class Ex15A13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Valor da Hora de Trabalho (R$/h): ");
        double ht = scan.nextDouble();
        System.out.println("Digite o Valor das Horas Trabalhadas nesse Mês: ");
        double hora = scan.nextDouble();
        double salarioBruto = ht*hora;
        double ir = salarioBruto*0.11;
        double inss = salarioBruto*0.08;
        double sindicato = salarioBruto*0.05;
        double salarioLiquido = (salarioBruto -(ir+inss+sindicato));
        
         System.out.println("                                          ");
         System.out.println("CONTRACHEQUE");
         System.out.println("Rendimentos");
         System.out.println("                                          ");
         System.out.println("Valor da Hora: " +"R$" +ht);
         System.out.println("Quantidade de Horas Trabalhada: " +hora +"hs");
         System.out.println("Salário Bruto: " +"R$" +salarioBruto);
         System.out.println("                                            ");
         System.out.println("Descontos");
         System.out.println("                                            ");
         System.out.println("Imposto de Renda Retido na Fonte: " +"R$" +ir);
         System.out.println("INSS: " +"R$" +inss);
         System.out.println("Sindicato: " +"R$" +sindicato);
         System.out.println("                                             ");
         System.out.println("Salário Líquido: " +"R$" +salarioLiquido);
         
    }
    
}
