//Exercício 04 - Aula 24
//Usando o resultado do modelo “Livro” como base, crie uma classe “LivroDeBiblioteca” 
//que represente os dados básicos de um livro de uma biblioteca, que pode ser emprestado
//a leitores.
//Autor: Flávio Alencar - 16OUT24 - 18h46

package exercicios.Lista06;
import java.util.Date;

public class Ex04A24
{
     public static void main(String[] args)
     {
        
        LivroBiblioteca livro = new LivroBiblioteca();
        
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Loiane";
        
        System.out.println("Nome do livro = " + livro.nome);
     }
    
}
