//Exercício 36 - Aula 19
//Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento
//do vetor A é formado pela potência de base 2 elevado ao expoente igual a
//posição do respectivo elemento, ou seja: A[i] = 2i. Sugestão int A[11];
//Method: Array - for - if - else - break
//Autor: Flávio Alencar - 04OUT24 - 17h26 

public class Ex36A19
{
    public static void main (String[] args)
    {
        //                               Variaveis
        //-----------------------------------------------------------------------------------------
        double[] vetorA = new double[11];            //Array A
        //-----------------------------------------------------------------------------------------
        
        for (int i = 0; i < vetorA.length; i++)
        {
            vetorA[i] = Math.pow(2, i);
        }
        
        System.out.println("Vetor A");
        System.out.println();
        for (int i = 0; i < vetorA.length; i++)
        {
            System.out.println("Posição " +i +" " +vetorA[i]);
        }
    }
}
