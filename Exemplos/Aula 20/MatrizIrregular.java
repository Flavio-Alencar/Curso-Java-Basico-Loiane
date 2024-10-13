//Exemplo 02 - Aula 20
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 07OUT24 - 16h21

import java.util.Scanner;

public class MatrizIrregular
{
    
    public static void main (String[] args)
    {
    Scanner scan = new Scanner(System.in);
    
    //                    DECLARAÇÃO DE VARIÁVEIS
        //----------------------------------------------------------------------
        int numEntrevistados = 0;
        int qtdFilhos = 0;
        //----------------------------------------------------------------------
    
        System.out.print("Digite a Quantidade de Pessoas que serão Entrevistadas: ");
        numEntrevistados = scan.nextInt();
        String[][] nomeFilhos = new String [numEntrevistados][];
        System.out.println();
        
        for (int i = 0; i < nomeFilhos.length; i++)
        {
            System.out.print("Entre com a Quantidade de Filhos: ");
            qtdFilhos = scan.nextInt();
            scan.nextLine();
            nomeFilhos[i] = new String[qtdFilhos];
            System.out.println();
            
            for (int j = 0; j < nomeFilhos[i].length; j++)
            {
                System.out.print("Digite o Nome do Filho " +(j+1) +" : ");
                nomeFilhos[i][j] = scan.nextLine();
            }
            System.out.println();
        }
        
        for (int i = 0; i < nomeFilhos.length; i++)
        {
            System.out.println("O Entrevistado " +(i+1) +" tem " +nomeFilhos[i].length +" Filhos");
            
            for (int j = 0; j < nomeFilhos[i].length; j++)
        {
                System.out.println(nomeFilhos[i][j]);
        }
        
            System.out.println();
        }
    }
}
