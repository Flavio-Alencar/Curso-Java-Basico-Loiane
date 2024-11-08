//Exemplo 01 - Aula 40
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 08NOV24 - 15h06
//Assunto: Herança e polimorfismo

package exemplos.Aula40;

public class Aluno extends Pessoa {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String curso;
    private double[] notas;
    //--------------------------------------------------------------------------

    public Aluno() {
    }

    public Aluno(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }
    
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
    
    public void metodoQualquer(){
        super.setCpf("123.456.789-70");
        this.setCpf("12345678970");
    }
    
    public String obterEtiquetaEndereco(){
        String s = "O endereço do Aluno: ";
        s += super.getEndereco();
        
        return s;                
    }
}
