//Exercício 03 - Lista 08
//Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, 
//métodos getters e setters e construtores. Os métodos que serão utilizados pela
//classe de teste devem ser públicos. Se necessário, crie métodos privados como
//auxiliares para organizar melhor o código fonte também. 
//Escreva uma classe para representar um Aluno. Adicione atributos relacionados 
//às caracteristicas de um Aluno, como nome, matricula, curso que está matriculado, 
//nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva 
//um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em
//uma determinada disciplina. Escreva um programa para testar essa classe, que
//pede as informações do aluno ao usuário e ao final informa o nome das disciplinas, 
//mostra as notas e mostra se o aluno foi aprovado ou não.
//Autor: Flávio Alencar - 27OUT24 - 10h34 AM.

package exercicios.Lista08;
import java.util.Scanner;

public class Aluno {

private Scanner scan = new Scanner(System.in);
    
    //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    private String nome;
    private String matricula;
    private String curso;
    private String[] disciplinas;
    private double[][] notas;
     //--------------------------------------------------------------------------

    public Aluno(){
        disciplinas = new String[3];
        notas = new double[3][4];
    }
    
    public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notas, int indexD, int indexN) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = new String[3];
        this.notas = new double[3][4];
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public void setDisciplinasPos(int pos, String disciplina){
        this.disciplinas[pos] = disciplina;        
    }
    
    public void setNotasPos(int pos, int pos1, double nota){
        this.notas[pos][pos1] = nota;
        
    }
    
    public void mostrarInfo(){
        System.out.println("          FACULDADE TABAJARA          ");
        System.out.println("--------------------------------------");
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Matricula: %s%n", this.matricula);
        System.out.printf("Curso: %s%n", this.curso);
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("                BOLETIM               ");
        System.out.println("--------------------------------------");
    }
    
    public boolean calcularMedia(){
       for(int i = 0; i < this.disciplinas.length; i++){
           System.out.println("Disciplina: " +this.getDisciplinas()[i]);
           double soma = 0;
           double media = 0;
           for(int j = 0; j < this.notas[i].length; j++){
               soma += notas[i][j];
           }
               media = soma/this.notas[i].length;
               
               if(media >= 7){
                   System.out.println("Média: " +media);
                   System.out.println("APROVADO!!");
                   System.out.println();
               }
               else{
                   System.out.println("Média: " +media);
                   System.out.println("REPROVADO!!");
                   System.out.println();                   
               }
       }
               return true;
    }
        
       
   }

    
   
    
    
    
    
    

