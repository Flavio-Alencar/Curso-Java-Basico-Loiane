//Exemplo 01 - Aula 25
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 16OUT24 - 21h18
//Vinculado à Classe Carro

package exemplos.Aula25;

public class TesteCarro
{
    public static void main (String[] args)
    {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
        
        van.exibirAutonomia();
        
    }
    
}
