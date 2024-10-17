//Exemplo 01 - Aula 26
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 16OUT24 - 21h36
//Vinculado à Classe Carro

package exemplos.Aula26;

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
        System.out.println("");
        
        van.exibirAutonomia();
        System.out.println("");
        
        double autonomia = van.obterAutonomia();
        
        System.out.println("A Autonomia do Carro é: " +autonomia +"Km");
        
    }
    
}
