//Exercício 03 - Aula 17

//Faça um programa que leia e valide as seguintes informações:
//a. Nome: maior que 3 caracteres;
//b. Idade: entre 0 e 150;
//c. Salário: maior que zero;
//d. Sexo: 'f' ou 'm';
//e. Estado Civil: 's', 'c', 'v', 'd';

//while 
//Autor: Flávio Alencar - 11SET24 - 19h09

import java.util.Scanner;

public class Ex03A17
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Variáveis
        //----------------------------------------------------------------------
        char sexo;            //Variável Sexo.
        char estadoCivil;     //Variável Estado Civil
        double salario = 0.0;  //Variável Salário.
        int idade = 0;        //Variável Idade.
        String nome;          //Variável Nome.
        //----------------------------------------------------------------------
        
        System.out.print("Digite o Valor do Nome: ");
        nome = scan.nextLine();
        System.out.println();
        
        System.out.print("Digite a Idade [0 - 120]: ");
        idade = scan.nextInt();
        System.out.println();
        
        System.out.print("Digite o Salário: ");
        salario = scan.nextDouble();
        System.out.println();
        
        System.out.print("Digite o sexo [M - Masculino] ou [F - Feminino]: ");
        sexo = scan.next().charAt(0);
        System.out.println();
        
        System.out.print("Digite o Estado Civil [S - Solteiro], {C - Casado], [V - Viúvo] ou [D - Divorciado}: ");
        estadoCivil = scan.next().charAt(0);
        System.out.println();
        
        while (nome.length() < 03)
        {
            System.out.print("Nome Inválido, Digite o Nome maior que 03 Caracteres: ");
            nome = scan.nextLine();
            System.out.println();
        }
        
        while (idade < 0 || idade > 120)
        {
        System.out.print("Idade Inválida, Digite a Idade [0 - 120]: ");
        idade = scan.nextInt();
        System.out.println();            
        }
        
        while (salario < 0)
        {
        System.out.print("Salário Inválido, Digite o Salário: ");
        salario = scan.nextDouble();
        System.out.println();            
        }
        
        while (sexo != 'F' && sexo != 'f' && sexo != 'M' && sexo != 'm')
        {        
        System.out.print("Sexo Inválido, Digite o sexo [M - Masculino] ou [F - Feminino]: ");
        sexo = scan.next().charAt(0);
        System.out.println();
        }
        
        while (estadoCivil != 'S' && estadoCivil != 's' && estadoCivil != 'C' && estadoCivil != 'C' && estadoCivil != 'V' && estadoCivil != 'v'
                && estadoCivil != 'D' && estadoCivil != 'd')
        {
        System.out.printf("Estado Civil Inválido %s%n", "Digite o Estado Civil [S - Solteiro], {C - Casado], [V - Viúvo] ou [D - Divorciado}: ");
        estadoCivil = scan.next().charAt(0);
        System.out.println();            
        }
        
        System.out.println("                     CADASTRO"                     );
        System.out.println("--------------------------------------------------");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d%n", idade);
        System.out.printf("Salário: %s%.2f%n", "R$", salario);
        
        switch (sexo)
        {
            case ('F'): System.out.printf("Sexo: %s%n", "Feminino"); break;
            case ('f'): System.out.printf("Sexo: %s%n", "Feminino"); break;
            case ('M'): System.out.printf("Sexo: %s%n", "Masculino"); break;
            case ('m'): System.out.printf("Sexo: %s%n", "Masculino"); break;
            default: System.out.println(); break;
        }
        
        
        switch (estadoCivil)
        {
            case ('S'): System.out.printf("Estado Civil: %s%n", "Solteiro(a)"); break;
            case ('s'): System.out.printf("Estado Civil: %s%n", "Solteiro(a)"); break;
            case ('C'): System.out.printf("Estado Civil: %s%n", "Casado(a)"); break;
            case ('c'): System.out.printf("Estado Civil: %s%n", "Casado(a)"); break;
            case ('V'): System.out.printf("Estado Civil: %s%n", "Viúvo(a)"); break;
            case ('v'): System.out.printf("Estado Civil: %s%n", "Viúvo(a)"); break;
            case ('D'): System.out.printf("Estado Civil: %s%n", "Divorciado(a)"); break;
            case ('d'): System.out.printf("Estado Civil: %s%n", "Divorciado(a)"); break;
            default: System.out.println(); break;
        }
        
       
    }
    
}
