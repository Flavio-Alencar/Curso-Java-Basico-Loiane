//Exemplo 01 - Aula 24
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 16OUT24 - 16h58
//Vinculado à Classe Carro

package exemplos.Aula24;

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
        
        Carro fusca = new Carro();
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
        
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
    
}
