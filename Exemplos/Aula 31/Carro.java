//Exemplo 01 - Aula 31
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 25OUT24 - 14h52
//Assunto: Modificadores "public" e "private"

package exemplos.Aula31;

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

     public void exibirAutonomia()
      {
          System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
      }
      
      double obterAutonomia()
      {
          System.out.println("Método obterAutonomia foi chamado.");
          return capCombustivel * consumoCombustivel;
      }
      
      private double dividirKmCgas(double km)
      {
          double qtdCombustivel = km/consumoCombustivel;
          return qtdCombustivel;          
      }
      
      double calcularCombustivel(double km)
      {
          
          return this.dividirKmCgas(km);
      }
      
      

   
}
