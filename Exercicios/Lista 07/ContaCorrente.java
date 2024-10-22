//Exercício 02 - Lista 07
//Cria uma classe para representar uma conta corrente que possui um número, um saldo,
//um status que informa se ela é especial ou não, um limite. Desenvolva métodos
//para realizar saque (verificando se o cliente pode realizar saques), despositar 
//dinheiro, consultar saldo e verificar se o cliente está usando cheque especial
//ou não. Desenvolva um programa para testar essa classe. 
//Autor: Flávio Alencar - 18OUT24 - 17h57

package exercicios.Lista07;
import java.util.Scanner;

public class ContaCorrente
{
    Scanner scan = new Scanner(System.in);
    
     //                      DECLARAÇÃO DE VARIAVEIS GLOBAIS
    //--------------------------------------------------------------------------
    String numConta;
    boolean especial;
    double saldo;            
    double limite;
    //--------------------------------------------------------------------------
    
    double realizarSaque(double saque)
    {
        double valor = saldo - saque;
        double cond = limite + valor;
        
        if (cond < 0)
        {
            System.out.println("Saque Acima do Limite");
        }
        else
        {
            System.out.println("Saque Realizado com Sucesso");
            System.out.println("Saldo R$" +valor);
        }
               
        return valor;
        
    }
    
    double depositar (double deposito)
    {
        double novoSaldo = deposito + saldo;
        System.out.println("Saldo R$" +novoSaldo);
        return novoSaldo;
    }
    
    void consultarSaldo()
    {
        System.out.printf("Saldo: %s%,.2f", "R$", saldo);
        System.out.println("");
    }
    
    void verificarChequeEspecial()
    {
        if (saldo < 0)
        {
            System.out.println("CHEQUE ESPECIAL: SIM!!");
        }
        else
        {
            System.out.println("CHEQUE ESPECIAL: NÃO!!");
        }
    }
    
    void verificarEspecial()
    {
        if (especial)
        {
            System.out.println("Cliente ESPECIAL");
        }
        else
        {
            System.out.println("Cliente NÃO ESPECIAL");
        }
    }
}