//Exemplo 01 - Aula 29
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 23OUT24 - 21h34
//Construtores

package exemplos.Aula29;

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
      
      Carro(String marc, String model, int numPass, double capGas, double consumoGas)
      {
          marca = marc;
          modelo = model;
          numPassageiros = numPass;
          capCombustivel = capGas;
          consumoCombustivel = consumoGas;
      }
}
