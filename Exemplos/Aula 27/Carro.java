//Exemplo 01 - Aula 27
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 18OUT24 - 15h03

package exemplos.Aula27;

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
