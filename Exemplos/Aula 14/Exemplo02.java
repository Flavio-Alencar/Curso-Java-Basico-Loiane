//Exemplo 02 - AUla 14

import java.util.Scanner;

public class Exemplo02 {
    
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a sua Idade: ");
        int idade = scan.nextInt();
        
        if (idade >= 18){
            System.out.println("Maior de Idade");
        }
        else{
            System.out.println("Menor de Idade");
        }
        }       
        
    }
    
