//Exercício 01 - Lista 11
//Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada contato
//possui nome, telefone e email. A Agenda também possui um nome. Crie um programa 
//teste que peça para o usuário entrar com o nome da Agenda e em seguida 3 contatos.
//Crie métodos que retornem uma String com a informação de cada contato e também
//de todos os contatos da agenda.  
//Autor: Flávio Alencar - 02OUT24 - 18h33 PM
//Vinculado a classe Agenda

package exercicios.Lista11;

public class Contato {
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nome;
    private String telefone;
    private String eMail;
    //--------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
    public String obterInfo(){
        return "Nome: " +nome +" "+
               "Telefone: " +telefone +" "+
               "eMail: " +eMail;
    }
    
}
