//Exemplo 01 - Aula 27
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 18OUT24 - 15h09
//Vinculado à Classe Carro

package exemplos.Aula27;

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
        System.out.println("");
        
        double qtdCombustivel10 = van.calcularCombustivel(10);
        double qtdCombustivel15 = van.calcularCombustivel(15);
        
        System.out.println("Quantidade de Combustivel para 10 Km: " +qtdCombustivel10 +" L");
        System.out.println("Quantidade de Combustivel para 15 Km: " +qtdCombustivel15 +" L");
        
    }
    
}
