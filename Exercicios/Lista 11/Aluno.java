//Exercício 02 - Lista 11
//Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso
//tem um Professor, que possui nome, departamento e email. Cada Curso também pode 
//ter vários alunos (tipo Aluno). Cada Aluno tem nome, matricula e 4 notas. Escreva 
//um programa teste que crie um Curso com 5 alunos, e que preça para o usuário entrar
//com as 4 notas de cada aluno. Ao final, imprima a média de cada aluno, se o mesmo
//está aprovado (media maior ou igual a 7), e qual é a média da turma. 
//Autor: Flávio Alencar - 03OUT24 - 12h13 PM
//Vinculado a classe Curso

package exercicios.Lista11;

public class Aluno {
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nome;
    private String matricula;
    private double[] notas;
    //--------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public String obterInfo(){
        String info = "Aluno: " +nome +"\n" +
                      "Matricula: " +matricula +"\n";
        double soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];            
        }
        
        double media = (double)soma/notas.length;
        info += "Média: " +media +"\n";
        
        if(media >= 7){
            info += "APROVADO";
        }
        else{
            info += "REPROVADO";
        }
        info += "\n";
        
        return info;
    }
    
    
    
}
