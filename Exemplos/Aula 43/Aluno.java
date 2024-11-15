//Exemplo 01 - Aula 43
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 08NOV24 - 20h51
//Assunto: Classe Object

package exemplos.Aula43;
import java.util.Arrays;
import java.util.Objects;

public class Aluno {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String curso;
    private double[] notas;
    //--------------------------------------------------------------------------

    public Aluno() {
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
        //super.setCpf("123.456.789-70");
        //this.setCpf("12345678970");
    }
    
    public  String obterEtiquetaEndereco(){
        String s = "O endereço do Aluno: ";
        //s += super.getEndereco();
        
        return s;                
    }

       public void imprimirEtiquetaEndereco() {
           System.out.println(this.obterEtiquetaEndereco());
           
       }
       
       /*public String toString(){
           String s = curso + "\n";
           
           for(double i: notas){
               s += i + " ";
           }
           return s;
       }*/


    public String toString() {
        return "curso=" + curso + "\n"
               +"notas = " + Arrays.toString(notas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if(curso.equalsIgnoreCase(other.getCurso())){
            return true;
        }
        return false;
    }
    
    
       
    


    
       
       
}
