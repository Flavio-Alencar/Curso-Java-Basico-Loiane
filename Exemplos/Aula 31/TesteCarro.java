//Exemplo 01 - Aula 30
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 25OUT24 - 14h58
//Vinculado à Classe Carro
//Assunto: Modificadores "public" e "private"

package exemplos.Aula31;

public class TesteCarro
{
    public static void main (String[] args)
    {
        Carro carro = new Carro();
        carro.consumoCombustivel = 10;
        
        double qtdLitros = carro.calcularCombustivel(10);
        System.out.println(qtdLitros +"L");
    }
}
