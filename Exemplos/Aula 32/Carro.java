//Exemplo 01 - Aula 32
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 25OUT24 - 15h38
//Assunto: Encapsulamento - metodos get e set

package exemplos.Aula32;

public class Carro 
{
     //                    DECLARAÇÃO DE VARIÁVEIS
     //---------------------------------------------------------------------------------------
      private String marca;                    //Variavel que armazena a marca.
      private String modelo;                   //Variavel que armazena o modelo.
      private int numPassageiros;              //Variavel que armazena o numero de pasageiros.
      private double capCombustivel;           //Litros.
      private double consumoCombustivel;       //Km/L.
      //---------------------------------------------------------------------- ----------------

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

     
}
