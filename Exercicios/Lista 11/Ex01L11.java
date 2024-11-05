//Exercício 01 - Lista 11
//Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada contato
//possui nome, telefone e email. A Agenda também possui um nome. Crie um programa 
//teste que peça para o usuário entrar com o nome da Agenda e em seguida 3 contatos.
//Crie métodos que retornem uma String com a informação de cada contato e também
//de todos os contatos da agenda.  
//Autor: Flávio Alencar - 02OUT24 - 18h33 PM
//Vinculado a classe Agenda

package exercicios.Lista11;
import java.util.Scanner;

public class Ex01L11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o Nome da Agenda: ");
        String nome = scan.nextLine();
        System.out.println();
        
        Agenda agenda = new Agenda(nome);
        Contato[] contatos = new Contato[3];
        
        for(int i = 0; i < contatos.length; i++){
            System.out.print("Entre com as Informações do Contato " +(i+1) +": ");
            Contato c = new Contato();
            System.out.println();
            
            System.out.print("Digite o Nome:");
            nome = scan.nextLine();
            c.setNome(nome);
            System.out.println();
            
            System.out.print("Digite o Telefone: ");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);
            System.out.println();
            
            System.out.print("Digite o email: ");
            String eMail = scan.nextLine();
            c.seteMail(eMail);
            System.out.println();
            
            contatos[i] = c;
        }
        
        agenda.setContatos(contatos);
        
        if(agenda != null){
            System.out.println(agenda.obterInfo());
        }  
    }
}
