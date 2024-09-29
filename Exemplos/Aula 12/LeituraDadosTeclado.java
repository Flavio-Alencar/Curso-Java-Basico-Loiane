//Aula 12 - Leitura de Dados pelo Teclado

import java.util.Scanner; //Copmando para importar a Classe Scanner do Java

public class LeituraDadosTeclado {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       /* System.out.println("Digite seu Primeiro Nome: ");
        String primeiroNome = scan.nextLine();
        System.out.println("Digite seu Ultimo Nome: ");
        String segundoNome = scan.nextLine();
        System.out.println("Digite sua Idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite a sua Altura (m): ");
        double altura = scan.nextDouble();*/
       
       System.out.println("Digite seu Primeiro Nome, Idade, Quantidade de Filhos, altura e Se tem Pet: ");
       String primeiroNome = scan.nextLine();
       int idade = scan.nextInt();
       byte qtdFilho = scan.nextByte();
       double altura = scan.nextDouble();
       boolean pet = scan.nextBoolean();
        
        System.out.println("                                       ");
        System.out.println("--------------------------------------");
        System.out.println("Primeiro Nome: " +primeiroNome);
        System.out.println("Idade: " +idade);
        System.out.println("Quantidade de Filhos: " +qtdFilho);
        System.out.println("Altura (m): " +altura);
        System.out.println("Tem Pet? " +pet);
        System.out.println("--------------------------------------");
        System.out.println("                                       ");
    }
}
