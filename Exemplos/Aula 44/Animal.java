//Exemplo 01 - Aula 44
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 15NOV24 - 10h06 AM
//Assunto: Interface

package exemplos.Aula44;

public abstract class Animal {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nome;
    //--------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void emitirSom();
    
}
