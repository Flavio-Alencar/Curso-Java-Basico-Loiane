//Exemplo 01 - Aula 30
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 25OUT24 - 14h40
//Assunto: Utilização do "this"

package exemplos.Aula30;

public class Carro 
{
     //                    DECLARAÇÃO DE VARIÁVEIS
     //---------------------------------------------------------------------------------------
      String marca;                    //Variavel que armazena a marca.
      String modelo;                   //Variavel que armazena o modelo.
      int numPassageiros;              //Variavel que armazena o numero de pasageiros.
      double capCombustivel;           //Litros.
      double consumoCombustivel;       //Km/L.
      //---------------------------------------------------------------------- ----------------

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando Construtor com 03 Parâmetros");
    }
    
    public Carro(String marca, String modelo)
    {
        this(marca, modelo, 10);
        System.out.println("Chamando Construtor com 02 Parâmetros");
    }
      
      
      
      void exibirAutonomia()
      {
          System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
      }
      
      double obterAutonomia()
      {
          System.out.println("Método obterAutonomia foi chamado.");
          return capCombustivel * consumoCombustivel;
      }
      
      double calcularCombustivel(double km)
      {
          double qtdCombustivel = km/consumoCombustivel;
          return qtdCombustivel;
      }
      
      

   
}
