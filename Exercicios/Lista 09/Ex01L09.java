//Exercício 01 - Lista 09
//Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado
//sempre que a classe for instanciada. Crie métodos para zerar, incrementar e retornar
//o valor do contador. Desenvolva um programa para testar essa classe.
//Autor: Flávio Alencar - 30OUT24 - 10h52 AM
//Vinculado a classe Contador

package exercicios.Lista09;
import java.util.Scanner;

public class Ex01L09 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um Número Inteiro: ");
        int num = scan.nextInt();
        System.out.println();
        
        System.out.println(Contador.incrementar(num));
        System.out.println(Contador.decrementar(num));
        System.out.println(Contador.zerar(num));
        
    }
    
}
