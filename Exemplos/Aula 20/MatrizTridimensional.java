//Exemplo 02 - Aula 20
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 07OUT24 - 15h25

public class MatrizTridimensional 
{
    public static void main(String[] args)
    {
        //                    DECLARAÇÃO DE VARIÁVEIS
        //----------------------------------------------------------------------
        int [][][] matriz3d = new int [3][3][3];
        //----------------------------------------------------------------------
        
        for (int i = 0; i < matriz3d.length; i++)
        {
            for (int j = 0; j < matriz3d[i].length; j++)
            {
                for (int k = 0; k < matriz3d[i][j].length; k++)
                {
                    matriz3d[i][j][k] = i + j + k;                    
                }
            }
        }
        
        int soma = 0;
        int somapares = 0;
        int somaimpares = 0;
        
        for (int i = 0; i < matriz3d.length; i++)
        {
            for (int j = 0; j < matriz3d[i].length; j++)
            {
                for (int k = 0; k < matriz3d[i][j].length; k++)
                {
                    soma += matriz3d[i][j][k];

                    if (matriz3d[i][j][k] % 2 ==0)
                    {
                        somapares += matriz3d[i][j][k];
                    }
                    else
                    {
                        somaimpares += matriz3d[i][j][k];
                    }
                }
            }
        }
        
        System.out.println("Soma Total: " +soma);
        System.out.println("Soma dos Pares: " +somapares);
        System.out.println("Soma dos Ímpares: " +somaimpares);
            
    }
}