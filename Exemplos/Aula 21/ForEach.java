//Exemplo 01 - Aula 21
//Loiane Training - Java Basic Course
//Editado por Flávio Alencar
//Data: 15OUT24 - 21h11

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {
        Random ran = new Random();

        //                    DECLARAÇÃO DE VARIÁVEIS
        //----------------------------------------------------------------------
        int[] notas = new int[10];          //Array com 10 notas do tipo inteiro.
        //----------------------------------------------------------------------  

        for (int i = 0; i < notas.length; i++) {
            notas[i] = ran.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        for (int nota : notas) {
            System.out.print(nota + " ");
        }

    }
}
