//Exemplo 01 - Aula 41
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 08NOV24 - 17h47
//Assunto: Classe abstrata

package exemplos.Aula41;


public abstract class Pessoa {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    //--------------------------------------------------------------------------

     public Pessoa() {
         super();
    }
     
    public Pessoa(String nome, String endereco, String telefone) {
        super();
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public abstract String obterEtiquetaEndereco();
    
    public abstract void imprimirEtiquetaEndereco();
    
    
    
    
}
