//Exemplo 01 - Aula 37
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 04NOV24 - 21h29
//Assunto: Herança

package exemplos.Aula37;

public class Professor extends Pessoa {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nomeCurso;
    private double salario;
    //--------------------------------------------------------------------------

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
    
}
