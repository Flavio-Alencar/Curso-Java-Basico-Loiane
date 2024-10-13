//Exemplo 01 - Aula 20
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 07OUT24 - 14h24

public class Matrizes 
{
    public static void main(String[] args)
    {
        //                    DECLARAÇÃO DE VARIÁVEIS
        //----------------------------------------------------------------------
        double[][] notasAlunos = new double[3][4];
        double media = 0.0;
        //----------------------------------------------------------------------
        
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 9.5;
        
        notasAlunos[1][0] = 9;
        notasAlunos[1][1] = 8;
        notasAlunos[1][2] = 7;
        notasAlunos[1][3] = 9;
        
        notasAlunos[2][0] = 8;
        notasAlunos[2][1] = 9;
        notasAlunos[2][2] = 10;
        notasAlunos[2][3] = 7;
        
        for (int i = 0; i < notasAlunos.length; i++)
        {
            double soma = 0.0;
            for (int j = 0; j < notasAlunos[i].length; j++)
            {
                soma += notasAlunos[i][j];
            }
            
            media = soma/4;
            System.out.println("A Média do Aluno " +(i+1) +" : " +media);
        }
    }
}
