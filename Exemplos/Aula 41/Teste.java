//Exemplo 01 - Aula 41
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 08NOV24 - 17h47
//Assunto: Classe abstrata

package exemplos.Aula41;

public class Teste {
    public static void main(String[] args) {
        
        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        //pessoa.setEndereco("6º BPM");
        aluno.setEndereco("Batalhão de ROTAM");
        professor.setEndereco("Batalhão de CHOQUE");
        
        //System.out.println(pessoa.obterEtiquetaEndereco());
        //System.out.println(aluno.obterEtiquetaEndereco());
        //System.out.println(professor.obterEtiquetaEndereco());
        
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
        
        
    }
    
}
