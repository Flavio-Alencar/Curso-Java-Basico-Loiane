//Exercício 02 - Lista 11
//Escreva uma classe para representar um Curso, que tem nome e horário. Cada curso
//tem um Professor, que possui nome, departamento e email. Cada Curso também pode 
//ter vários alunos (tipo Aluno). Cada Aluno tem nome, matricula e 4 notas. Escreva 
//um programa teste que crie um Curso com 5 alunos, e que preça para o usuário entrar
//com as 4 notas de cada aluno. Ao final, imprima a média de cada aluno, se o mesmo
//está aprovado (media maior ou igual a 7), e qual é a média da turma. 
//Autor: Flávio Alencar - 03OUT24 - 12h13 PM

package exercicios.Lista11;

public class Curso {
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nomeCurso;
    private String horario;
    private Professor prof;
    private Aluno[] alunos;
    //--------------------------------------------------------------------------

    public Curso(String nomeCurso, String horario) {
        this.nomeCurso = nomeCurso;
        this.horario = horario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }


    public String obterInfo(){
        System.out.println("          FACULDADE TABAJARA          ");
        System.out.println("--------------------------------------");
        System.out.println();
        String info = "Nome do Curso: "+nomeCurso +"\n";
        info += "Horário: " +horario +"\n";
        
        if(prof != null){
            System.out.println(prof.obterInfo());
        }
        
        System.out.println("          ALUNOS          ");
        System.out.println("--------------------------");
        System.out.println();
        
        if(alunos != null){
            for(int i = 0; i < alunos.length; i++){
                if(alunos[i] != null){
                    info += alunos[i].obterInfo() +"\n";                    
                }
            }
        }
        
        return info;
    }
}

   
    
    
    

