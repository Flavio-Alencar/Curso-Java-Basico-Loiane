//Exemplo 01 - Aula 32
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 25OUT24 - 15h40
//Vinculado à Classe Carro
//Assunto: Encapsulamento - metodos get e set

package exemplos.Aula32;

public class TesteCarro
{
    public static void main (String[] args)
    {
        Carro van = new Carro();
        van.setMarca("Fiat"); 
        van.setModelo("Ducato");
        
        System.out.println("Marca: " +van.getMarca());
    }
}
