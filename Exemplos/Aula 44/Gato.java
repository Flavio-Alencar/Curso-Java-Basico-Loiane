//Exemplo 01 - Aula 44
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 15NOV24 - 10h06 AM
//Assunto: Interface

package exemplos.Aula44;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String raca;
    private int tamanho;
    //--------------------------------------------------------------------------

    public Gato() {
        super();
    }

    public Gato(String raca, int tamanho) {
        this.raca = raca;
        this.tamanho = tamanho;
    }
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void amamentar() {
    
    }

    public void emitirSom() {
   
    }

    public void levarVeterinario() {
    
    }

    public void alimentar() {
    
    }

    public void brincar() {
    
    }

    public void levarPassear() {
    
    }
}
