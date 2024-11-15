//Exemplo 01 - Aula 41
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 08NOV24 - 17h47
//Assunto: Classe abstrata

package exemplos.Aula41;

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
    
    public void imprimirEtiquetaEndereco() {
           System.out.println("Imprimendo Endereço do Professor: " +this.obterEtiquetaEndereco());           
       }
    
}
