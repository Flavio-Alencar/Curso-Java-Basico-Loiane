//Exemplo 01 - Aula 40
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 08NOV24 - 15h06
//Assunto: Herança e polimorfismo

package exemplos.Aula40;

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
    
    public String obterEtiquetaEndereco(){
        String s = "O endereço do Professor: ";
        s += super.getEndereco();
        
        return s;
    }
    
}
