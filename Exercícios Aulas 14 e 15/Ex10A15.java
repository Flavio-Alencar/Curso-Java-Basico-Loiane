//Exercício 10 - Aula 15

//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
//Usando o Comando switch - case
//Autor: Flávio Alencar - 28AGO24 - 20h56

import java.util.Scanner; //Importando a classe Scanner

public class Ex10A15 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //Declaração de Variáveis
        //----------------------------------
        
        char letra; //Armazenará a Letra a ser Digitada.
        
        //-----------------------------------
        
        System.out.print("Digite o seu Turno(M - Matutino, V - Vespertino ou N - Noturno): ");
        letra = scan.next().charAt(0);
        System.out.println("                          ");
        
        switch (letra)
        {
            case 'M': System.out.println("Bom dia!"); break;
            case 'm': System.out.println("Bom dia!"); break;
            case 'V': System.out.println("Boa Tarde!"); break;
            case 'v': System.out.println("Boa Tarde!"); break;
            case 'N': System.out.println("Boa Noite!"); break;
            case 'n': System.out.println("Boa Noite!"); break;
            default: System.out.println("Valor Inválido!"); break;
            
        }       
        
    }
    
}
