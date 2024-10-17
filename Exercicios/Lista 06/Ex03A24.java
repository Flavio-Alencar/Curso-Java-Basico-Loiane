//Exercício 03 - Aula 24
//Escreva uma classe para representar uma lâmpada que está à venda em um supermercado.
//Autor: Flávio Alencar - 16OUT24 - 18h46

package exercicios.Lista06;

public class Ex03A24 
{
     public static void main(String[] args)
     {
        
        LivroLivraria livro = new LivroLivraria();
        
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;
        livro.preco = 63.39;
        
        System.out.println("Nome do livro = " + livro.nome);
     }    
}
