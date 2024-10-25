//Exemplo 01 - Aula 30
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 25OUT24 - 14h48
//Vinculado à Classe Carro
//Assunto: Utilização do "this"

package exemplos.Aula30;

public class TesteCarro
{
    public static void main (String[] args)
    {
        Carro van = new Carro("Fiat", "Ducato");
        
        System.out.println("Número de Passageiros: " +van.numPassageiros);
    }
    
}
