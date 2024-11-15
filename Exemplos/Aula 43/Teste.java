//Exemplo 01 - Aula 43
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 08NOV24 - 20h51
//Assunto: Classe Object

package exemplos.Aula43;

public class Teste {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.setCurso("Ciência da Computação");
        double[] notas = {10, 9.8, 7.5, 8.9};
        aluno.setNotas(notas);
        
        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciência da Computação");
        double[] notas2 = {10, 9.2, 8.5, 9};
        aluno2.setNotas(notas2);
        
        System.out.println(aluno.equals(aluno2));
        
        
        
    }
}
