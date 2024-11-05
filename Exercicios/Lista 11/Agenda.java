//Exercício 01 - Lista 11
//Escreva uma classe Agenda, que contém vários contatos do tipo Contato. Cada contato
//possui nome, telefone e email. A Agenda também possui um nome. Crie um programa 
//teste que peça para o usuário entrar com o nome da Agenda e em seguida 3 contatos.
//Crie métodos que retornem uma String com a informação de cada contato e também
//de todos os contatos da agenda.  
//Autor: Flávio Alencar - 02OUT24 - 18h33 PM

package exercicios.Lista11;

public class Agenda {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nome;
    private Contato[] contatos;
    //--------------------------------------------------------------------------

    public Agenda(String nome) {
        this.nome = nome;
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    
    public String obterInfo(){
        String info = "Nome: " +nome +"\n";
        
        if(contatos != null){
            for(int i = 0; i < contatos.length; i++){
                info += contatos[i].obterInfo() +"\n";
            }
        }
        return info;
    }
}
    

    
