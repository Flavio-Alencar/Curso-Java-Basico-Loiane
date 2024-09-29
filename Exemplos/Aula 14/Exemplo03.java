//Exemplo 03 - Aula 14

import java.util.Scanner;

public class Exemplo03 {
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o Valor do kilo da Banana R$: ");
        double preco = scan.nextDouble();
        
        if (preco <= 10){
            System.out.println("Está Barato");          
            }
        else if( preco > 10 && preco <= 15){
            System.out.println("Pedir Desconto");
            }
        else if (preco > 15 && preco <= 17){
            System.out.println("Pesquisar mais");
            }
        else if( preco >= 17){
            System.out.println("Está Muito Caro");
            }

    }
    
}
