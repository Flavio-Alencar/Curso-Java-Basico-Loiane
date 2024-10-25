//Exemplo 01 - Aula 27
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 18OUT24 - 15h09
//Vinculado à Classe Carro

package exemplos.Aula29;

public class TesteCarro
{
    public static void main (String[] args)
    {
        Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.2);
        
        
        System.out.printf("Marca: %s%n",van.marca);
        System.out.printf("Modelo: %s%n",van.modelo);
        System.out.printf("Número de Passageiros: %d%n", van.numPassageiros);
        System.out.printf("Capacidade de Combustivel: %.2f%s%n", van.capCombustivel, "L");
        System.out.printf("Consumo de Combustível: %.2f%s%n", van.consumoCombustivel, "Km/L");
    }

    
}
