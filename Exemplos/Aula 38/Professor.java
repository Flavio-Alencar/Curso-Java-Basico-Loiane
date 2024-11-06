//Exemplo 01 - Aula 38
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 06NOV24 - 14h12
//Assunto: Herança super

package exemplos.Aula38;

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
