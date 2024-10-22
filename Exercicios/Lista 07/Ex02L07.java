//Exercício 02 - Lista 07
//Cria uma classe para representar uma conta corrente que possui um número, um saldo,
//um status que informa se ela é especial ou não, um limite. Desenvolva métodos
//para realizar saque (verificando se o cliente pode realizar saques), despositar 
//dinheiro, consultar saldo e verificar se o cliente está usando cheque especial
//ou não. Desenvolva um programa para testar essa classe. 
//Autor: Flávio Alencar - 18OUT24 - 17h57
//Vinculado a Classe ContaCorrente

package exercicios.Lista07;
import java.util.Scanner;

public class Ex02L07
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta1 = new ContaCorrente();
        
        conta1.numConta = "10.000-X";
        conta1.especial = true;
        conta1.saldo = 5000.00;
        conta1.limite = 10000.00;
        
        System.out.println("          BANCO TABAJARA          ");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("Digite [1] para Saque");
        System.out.println("Digite [2] para Depósito");
        System.out.println("Digite [3] para Consultar Saldo");
        System.out.println("Digite [4] para Varificar Cheque Especial");
        System.out.println("Digite [5] para Varificar se é Cliente Especial");
        int i = scan.nextInt();
                
        if (i == 1)
        {
            System.out.print("Digite o valor do Saque R$: ");
            double saque = scan.nextDouble();
            System.out.println();
            conta1.realizarSaque(saque);
        }
        
        if (i == 2)
        {
            System.out.print("Digite o Valor a ser Depositado R$: ");
            double deposito = scan.nextDouble();
            System.out.println();
            conta1.depositar(deposito);
        }
        
        if (i == 3)
        {
            conta1.consultarSaldo();
        }
        
        if (i == 4)
        {
            conta1.verificarChequeEspecial();
        }
        
        if (i == 5)
        {
            conta1.verificarEspecial();
        }
        
        else
        {
            System.out.println("Opção Inválida!!!");
        }
    }
}
