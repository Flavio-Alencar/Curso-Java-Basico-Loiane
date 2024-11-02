//Exemplo 01 - Aula 35
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 02NOV24 - 15h39
//Assunto: Relacionamento tem um

package exemplos.Aula36;

public class Contato {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nome;
    private Endereco endereco;
    private Telefone[] telefones;
    //--------------------------------------------------------------------------

    public  String getNome() {
        return nome;
    }

    public  void setNome(String aNome) {
        nome = aNome;
    }

    public  Endereco getEndereco() {
        return endereco;
    }

    public  void setEndereco(Endereco aEndereco) {
        endereco = aEndereco;
    }

    public  Telefone[] getTelefones() {
        return telefones;
    }

    public  void setTelefones(Telefone[] aTelefones) {
        telefones = aTelefones;
    }

   

     
}
