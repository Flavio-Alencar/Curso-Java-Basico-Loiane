//Exemplo 01 - Aula 25
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 16OUT24 - 21h12

package exemplos.Aula25;

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
      
      

   
}
