//Exercício 02 - Lista 08
//Reescreva os seguintes exercícios, criando todos os atributos do tipo privado, 
//métodos getters e setters e construtores. Os métodos que serão utilizados pela
//classe de teste devem ser públicos. Se necessário, crie métodos privados como
//auxiliares para organizar melhor o código fonte também. 
//Cria uma classe para representar uma conta corrente que possui um número, um saldo,
//um status que informa se ela é especial ou não, um limite. Desenvolva métodos
//para realizar saque (verificando se o cliente pode realizar saques), despositar
//dinheiro, consultar saldo e verificar se o cliente está usando cheque especial 
//ou não. Desenvolva um programa para testar essa classe.
//Autor: Flávio Alencar - 26OUT24 - 12h00 AM
//Vinculada a classe ContaCorrente

package exercicios.Lista08;
import java.util.Scanner;

public class Ex02L08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente("19.787-X", "1234-5", 2500.50, 2000.00, true);
        
        conta1.mostrarConta();
        
        boolean flag = false;
        while(!flag){
            System.out.printf("Digite a Opção Desejada: %n%s%n%s%n%s%n%s%n%s%n", "[1] Saque", "[2] Depósito",
            "[3] Consultar Saldo", "[4] Verificar Cheque Especial", "[0] Sair");
            int cont = scan.nextInt();
            
            switch (cont){
                case(1): System.out.print("Digite o Valor do Saque: R$ ");
                         double saque = scan.nextDouble();
                         conta1.realizarSaque(saque);
                         System.out.println(); break;
                
                case(2): System.out.print("Digite o Valor do Depósito: R$ ");
                         double deposito = scan.nextDouble();
                         conta1.realizarDeposito(deposito);
                         System.out.println(); break;
                         
                case(3): conta1.consultarSaldo();break;
                
                case(4): conta1.consultaChequeEspecial(); break;
                
                case(0): flag = true; break;
                
                default: System.out.println("Opção Inválida, Digite a Opção Correta"); break;
            }
        }
    }
}
