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

public class Professor {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nome;
    private String departamento;
    private String eMail;
    //--------------------------------------------------------------------------

    public Professor(String nome, String departamento, String eMail) {
        this.nome = nome;
        this.departamento = departamento;
        this.eMail = eMail;
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String obterInfo(){
        String info = "Professor: " +nome +"\n";
        info += "Departamento: " +departamento +"\n";
        info += "E-Mail: " +eMail +"\n";
        
        return info;
               
    }
    
}
