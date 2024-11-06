//Exemplo 01 - Aula 37
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 04NOV24 - 21h29
//Assunto: Herança

package exemplos.Aula37;

public class Aluno extends Pessoa {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String curso;
    private double[] notas;
    //--------------------------------------------------------------------------

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }
}
