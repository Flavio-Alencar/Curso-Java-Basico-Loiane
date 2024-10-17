//Exercício 05 - Aula 24
//Cria uma classe para representar uma conta corrente que possui um número, um saldo,
//um status que informa se ela é especial ou não, um limite.  
//Autor: Flávio Alencar - 16OUT24 - 18h46

package exercicios.Lista06;

public class Ex05A24
{
    public static void main(String[] args)
    {
        ContaCorrente conta = new ContaCorrente();
        
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        
        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
        
    }
    
}
