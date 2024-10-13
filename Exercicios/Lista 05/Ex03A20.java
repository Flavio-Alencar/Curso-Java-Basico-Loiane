//Exercício 03 - Aula 20
//Capture do teclado valores para preenchimento de uma matriz M 3x3. Após a 
//captura imprima a matriz criada e encontre a quantidade de números pares, a 
//quantidade de números ímpares.
//Method: Array - for 
//Autor: Flávio Alencar - 13OUT24 - 10h11 AM

import java.util.Scanner;

public class Ex03A20 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //                               Variaveis
        //-----------------------------------------------------------------------------------------
        int[][] matriz = new int[3][3];        //Array 3X3
        int qtdpar = 0;                        //Variavel que armazena a quantidad de enumeros pares
        int qtdimpar = 0;                      //Variavel qeu armazena a quantidade de numeros impares.
        //-----------------------------------------------------------------------------------------    
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print("Digite um Número [0-100] na Linha " +i +" Coluna " +j +" : ");
                matriz[i][j] = scan.nextInt();
            }
        System.out.println();
        }
        
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                if (matriz[i][j] % 2 == 0)
                {
                    ++qtdpar;
                }
                else
                {
                    ++qtdimpar;
                }
            }
        }
        
        System.out.println("Matriz A 3X3");
        System.out.println();
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.printf("%3d", matriz[i][j]);                
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Quantidade de Númros Pares: " +qtdpar);
        System.out.println();
        System.out.println("Quantidade de Númros Ímpares: " +qtdimpar);
    }
}
